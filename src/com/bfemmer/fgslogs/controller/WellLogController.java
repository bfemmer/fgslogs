/*
The MIT License (MIT)

Copyright (c) 2016 Bill Femmer

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

package com.bfemmer.fgslogs.controller;

import com.bfemmer.fgslogs.applicationservice.WellLogApplicationService;
import com.bfemmer.fgslogs.infrastructure.DatFileWellLogRepository;
import com.bfemmer.fgslogs.infrastructure.JsonFileWellLogRepository;
import com.bfemmer.fgslogs.model.WellLog;
import com.bfemmer.fgslogs.model.WellLogModel;
import com.bfemmer.fgslogs.model.WellNumberEntity;
import com.bfemmer.fgslogs.view.MainWindow;
import com.bfemmer.fgslogs.viewmodel.LookupCodes;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.print.PrinterException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author bfemmer
 */
public class WellLogController implements KeyListener {

    @Override
    public void keyTyped(KeyEvent event) {
        
    }
    
    @Override
    public void keyPressed(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.VK_LEFT) {
            if (wellLogs == null) return;
            if (logIndex != 0) {
                showPreviousLog();
                event.consume();
            }
        }
        if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (wellLogs == null) return;
            if (logIndex != wellLogs.size() - 1) {
                showNextLog();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
    public enum DataSourceMode {
        FILE,
        DIRECTORY
    }
    
    private DataSourceMode dataSourceMode;
    private final MainWindow view;
    private final WellLogModel model;
    private Map<String, Component> componentMap;
    private File currentDirectory;
    private String selectedDatFile;
    private int logIndex;
    private List<WellLog> wellLogs;
    
    public WellLogController(WellLogModel model, MainWindow view) {
        this.model = model;
        this.view = view;
        
        currentDirectory = new java.io.File(".");
        selectedDatFile = "";
        logIndex = 0;
        
        // Create map of all components in the frame
        createComponentMap();
        
        // Clear out previous demo data in tree
        ((JTree)getComponentByName("wellTreeView")).setModel(null);
        ((JTree)getComponentByName("wellTreeView")).addKeyListener(this);
        resetEditor();
    }
    
    public void control() {        
        view.getOpenFileMenuItem().addActionListener((ActionEvent actionEvent) -> {
                loadLogFileWithDialog();
                dataSourceMode = DataSourceMode.FILE;
                resetEditor();
            });
        view.getOpenDirectoryMenuItem().addActionListener((ActionEvent actionEvent) -> {
                loadDirectoryWithDialog();
                dataSourceMode = DataSourceMode.DIRECTORY;
                resetEditor();
            });
        view.getExportSelectedMenuItem().addActionListener(
            (ActionEvent actionEvent) -> {
                exportSelectedToJsonFiles();
            });
        view.getExportAllToJsonMenuItem().addActionListener(
            (ActionEvent actionEvent) -> {
                exportAllToJsonFiles();
            });
        view.getPrintMenuItem().addActionListener(
            (ActionEvent actionEvent) -> {
                try {
                    ((JEditorPane)getComponentByName("editorPane")).print();
                } catch (PrinterException ex) {
                    Logger.getLogger(WellLogController.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        view.getExitMenuItem().addActionListener(
            (ActionEvent actionEvent) -> {
                System.exit(0);
            }); 
        view.getCopyMenuItem().addActionListener(
            (ActionEvent actionEvent) -> {
                ((JEditorPane)getComponentByName("editorPane")).copy();
            });
        view.getWellTreeView().addTreeSelectionListener((TreeSelectionEvent treeSelectionEvent) -> {
                
                // Well numbers are at level 3 in the path for directory mode
                // and at level 2 in the path for file mode ... just reset the
                // editor
                if (treeSelectionEvent.getPath().getPathCount() < 
                        (dataSourceMode.equals(DataSourceMode.DIRECTORY) ? 3 : 2)) {
                    resetEditor();
                    wellLogs = null;
                    return;
                }
                
                String well = treeSelectionEvent.getPath().getLastPathComponent().toString();
                
                // Get access to tree object and selected node
                JTree tree = ((JTree)getComponentByName("wellTreeView"));
                
                // Get selected node if it exists, and return if it does not
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
                if (node == null) return;
                
                WellLogApplicationService service = new WellLogApplicationService(
                    new DatFileWellLogRepository(currentDirectory.toString()));
                
                wellLogs = service.getWellLogByWellNumber(
                        ((WellNumberEntity)node.getUserObject()).getWellNumber());
                
                // Set editor with data from selected node
                logIndex = 0;
                updateLogDisplay();
            });
    }
    
    private void updateLogDisplay() {
        ((JEditorPane)getComponentByName("editorPane")).setText(
                com.bfemmer.fgslogs.utility.Html.getHtmlReport(wellLogs.get(logIndex)));
        ((JEditorPane)getComponentByName("editorPane")).setCaretPosition(0);
    }
    
    /**
     * Increment log index and update report display
     */
    private void showNextLog() {
        logIndex++;        
        updateLogDisplay();
    }
    
    /**
     * Decrement log index and update report display
     */
    private void showPreviousLog() {
        logIndex--;
        updateLogDisplay();
    }
    
    private void resetTree() {
        JTree tree = ((JTree)getComponentByName("wellTreeView"));
        
        // Clear out previous data
        tree.removeAll();
        tree.setModel(null);
        
        // Create top node with county name
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Well Logs");
        
        // Generate list of counties from map
        List<String> counties = new ArrayList<>();
        LookupCodes codes = new LookupCodes();
        codes.getCountyCodeMap().entrySet().forEach((entry) -> {
            counties.add(entry.getValue());
        });
        
        // Sort the list of counties
        Collections.sort(counties.subList(0, counties.size()));
        
        // Add county nodes to treeview
        counties.stream().map((county) -> new DefaultMutableTreeNode(county)).forEachOrdered((node) -> {
            rootNode.add(node);
        });
        
        // Set the model object for the tree
        tree.setModel(new DefaultTreeModel(rootNode));
    }
    
    private void updateTree(List<WellNumberEntity> wellNumbers) {
        JTree tree = ((JTree)getComponentByName("wellTreeView"));
        
        // Clear out previous data
        tree.removeAll();
        tree.setModel(null);
        
        // Create top node with county name
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Well Logs");
        
        // Create child nodes corresponding with each well log in the list
        wellNumbers.stream().forEach((entity) -> {
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(entity);
            rootNode.add(node);
        });
        
        // Set the model object for the tree
        tree.setModel(new DefaultTreeModel(rootNode));
    }
    
    public final DefaultMutableTreeNode findNode(String searchString) {
        JTree tree = ((JTree)getComponentByName("wellTreeView"));

        if (null == searchString) {
            return null;
        }
        
        List<DefaultMutableTreeNode> searchNodes = getSearchNodes((DefaultMutableTreeNode)tree.getModel().getRoot());
        DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();

        DefaultMutableTreeNode foundNode = null;
        int bookmark = -1;

        if( currentNode != null ) {
            for(int index = 0; index < searchNodes.size(); index++) {
                if( searchNodes.get(index) == currentNode ) {
                    bookmark = index;
                    break;
                }
            }
        }

        for(int index = bookmark + 1; index < searchNodes.size(); index++) {
            if (searchNodes.get(index) == null) continue;
            if(searchNodes.get(index).toString().toLowerCase().contains(searchString.toLowerCase())) {
                foundNode = searchNodes.get(index);
                break;
            }
        }

        if( foundNode == null ) {
            for(int index = 0; index <= bookmark; index++) {    
                if(searchNodes.get(index).toString().toLowerCase().contains(searchString.toLowerCase())) {
                    foundNode = searchNodes.get(index);
                    break;
                }
            }
        }
        return foundNode;
    }   

    private List<DefaultMutableTreeNode> getSearchNodes(DefaultMutableTreeNode root) {
        List<DefaultMutableTreeNode> searchNodes = new ArrayList<>();

        Enumeration<?> e = root.preorderEnumeration();
        while(e.hasMoreElements()) {
            searchNodes.add((DefaultMutableTreeNode)e.nextElement());
        }
        return searchNodes;
    }
    
    private void resetEditor() {
        ((JEditorPane)getComponentByName("editorPane")).setText(
            "<html><body><center><b>Lithologic Well Log</b></center></body></html>");
    }
    
    private void loadLogFileWithDialog() {
        int dialogResult;
        
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("FGS Lithologic Log File (.DAT)","dat");
        chooser.setFileFilter(filter);
        chooser.setCurrentDirectory(currentDirectory);
        
        dialogResult = chooser.showOpenDialog(null);
        
        if (dialogResult == JFileChooser.APPROVE_OPTION) {
            currentDirectory = chooser.getCurrentDirectory();
            selectedDatFile = chooser.getSelectedFile().getName();
            
            WellLogApplicationService service = 
                        new WellLogApplicationService(
                                new DatFileWellLogRepository(
                                        chooser.getSelectedFile().toString()));
            
            List<WellNumberEntity> wellNumbers = service.getWellNumbersForFile(chooser.getSelectedFile().toString());
            updateTree(wellNumbers);
            
            view.getFrame().setTitle("FGSLOGS (Lithologic Logs): " + chooser.getSelectedFile().toString());
            view.getExportMenu().setEnabled(true);
            view.getPrintMenuItem().setEnabled(true);
        }
    }
    
    /**
     * Loads treeview with well numbers grouped by county
     */
    private void loadDirectoryWithDialog() {
        int dialogResult;
        
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(currentDirectory);
        chooser.setDialogTitle("Select directory containing DAT files");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        
        dialogResult = chooser.showOpenDialog(null);
        
        if (dialogResult == JFileChooser.APPROVE_OPTION) {
            currentDirectory = chooser.getSelectedFile();
            
            //model.setWellLogs(wellLogApplicationService.getAllWellLogs());
            view.getFrame().setTitle("FGSLOGS (Lithologic Logs): " + chooser.getSelectedFile().toString());
            view.getExportMenu().setEnabled(true);
            view.getPrintMenuItem().setEnabled(true);
            
            // Add counties to treeview
            resetTree();
            
            // Generate list of counties from map
            List<String> counties = new ArrayList<>();
            LookupCodes codes = new LookupCodes();
            codes.getCountyCodeMap().entrySet().forEach((entry) -> {
                counties.add(entry.getValue());
            });
        
            // Sort the list of counties
            Collections.sort(counties.subList(0, counties.size()));
            
            WellLogApplicationService service = 
                        new WellLogApplicationService(
                                new DatFileWellLogRepository(
                                        currentDirectory.toString()));
            
            for (String county : counties) {
                // Find the county node in the tree
                DefaultMutableTreeNode countyNode = findNode(county);
                
                // Get (sorted) list of well numbers within the county
                List<WellNumberEntity> wellNumbers = service.getWellNumbersForCounty(county);
                
                for (WellNumberEntity entity : wellNumbers) {
                    // Create a new node and add it to the county node
                    DefaultMutableTreeNode node = new DefaultMutableTreeNode(entity);
                    countyNode.add(node);
                }
            }
        }
    }
    
    /**
     * Saves a single DAT file to a user-specified directory as JSON files
     */
    private void exportSelectedToJsonFiles() {
        
    }
    
    /**
     * Saves all DAT files to a user-specified directory as JSON files
     */
    private void exportAllToJsonFiles() {
        int dialogResult;
        
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File(currentDirectory.toString()));
        chooser.setDialogTitle("Select directory to export JSON files to");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        
        dialogResult = chooser.showOpenDialog(null);

        if (dialogResult == JFileChooser.APPROVE_OPTION) {
            WellLogApplicationService jsonService = new WellLogApplicationService(
                new JsonFileWellLogRepository(chooser.getSelectedFile().toString()));
            WellLogApplicationService datService = new WellLogApplicationService(
                new DatFileWellLogRepository(currentDirectory.toString()));
            
            File[] datFiles = chooser.getSelectedFile().listFiles();
        
            for (File datFile : datFiles) {
                List<WellLog> wellLogs = datService.getAllWellLogs(datFile.toString());
                jsonService.saveWellLogs(wellLogs);
                System.out.print(datFile.toString());
            }
            
            JOptionPane.showMessageDialog(null, 
                    "Export of log to JSON files in selected directory complete.", 
                    "Operation Completed", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void createComponentMap() {
        componentMap = new HashMap<>();
        List<Component> components = getAllComponents(view.getFrame());
        components.stream().forEach((comp) -> {
            componentMap.put(comp.getName(), comp);
        });
    }

    private List<Component> getAllComponents(final Container c) {
        Component[] comps = c.getComponents();
        List<Component> compList = new ArrayList<>();
        for (Component comp : comps) {
            compList.add(comp);
            if (comp instanceof Container)
                compList.addAll(getAllComponents((Container) comp));
        }
        return compList;
    }

    private Component getComponentByName(String name) {
        if (componentMap.containsKey(name)) {
            return (Component) componentMap.get(name);
        }
        else return null;
    }
}
