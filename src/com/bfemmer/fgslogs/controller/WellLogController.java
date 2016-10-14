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
import com.bfemmer.fgslogs.model.WellLog;
import com.bfemmer.fgslogs.model.WellLogModel;
import com.bfemmer.fgslogs.view.WellLogView;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author bfemmer
 */
public class WellLogController {
    private final WellLogView view;
    private final WellLogModel model;
    private Map<String, Component> componentMap;
    
    public WellLogController(WellLogModel model, WellLogView view) {
        this.model = model;
        this.view = view;
        
        // Create map of all components in the frame
        createComponentMap();
        
        // Clear out previous demo data in tree
        ((JTree)getComponentByName("wellTreeView")).setModel(null);
        
        resetEditor();
    }
    
    public void control() {        
        view.getOpenMenuItem().addActionListener(
            (ActionEvent actionEvent) -> {
                loadLogFileWithDialog();
                resetEditor();
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
        view.getWellTreeView().addTreeSelectionListener(
            (TreeSelectionEvent treeSelectionEvent) -> {
                // If root node was selected, clear out editor and return
                String well = treeSelectionEvent.getPath().getLastPathComponent().toString();
                if (well.equals("Well Logs")) {
                    resetEditor();
                    return;
                }
                
                // Get access to tree object and selected node
                JTree tree = ((JTree)getComponentByName("wellTreeView"));
                
                // Get selected node if it exists, and return if it does not
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
                if (node == null) return;
                
                // Extract WellLog object from node
                WellLog wellLog = (WellLog)node.getUserObject();
                
                // Set editor with data from selected node
                ((JEditorPane)getComponentByName("editorPane")).setText(wellLog.toHtml());
                ((JEditorPane)getComponentByName("editorPane")).setCaretPosition(0);
            });
    }
    
    private void updateTree() {
        JTree tree = ((JTree)getComponentByName("wellTreeView"));
        
        // Clear out previous data
        tree.removeAll();
        tree.setModel(null);
        
        // Create top node with county name
        DefaultMutableTreeNode countyNode = new DefaultMutableTreeNode("Well Logs");
        
        // Create child nodes corresponding with each well log in the list
        model.getWellLogs().stream().forEach((wellLog) -> {
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(wellLog);
            countyNode.add(node);
        });
        
        // Set the model object for the tree
        tree.setModel(new DefaultTreeModel(countyNode));
    }
    
    private void resetEditor() {
        ((JEditorPane)getComponentByName("editorPane")).setText(
            "<html><body><center><b>Lithology Well Log</b></center></body></html>");
    }
    
    private void loadLogFileWithDialog() {
        int dialogResult;
        
        JFileChooser openFile = new JFileChooser();
        dialogResult = openFile.showOpenDialog(null);
        
        if (dialogResult == JFileChooser.APPROVE_OPTION) {
            WellLogApplicationService wellLogApplicationService = 
                        new WellLogApplicationService(
                                new DatFileWellLogRepository(
                                        openFile.getSelectedFile().toString()));
                
            model.setWellLogs(wellLogApplicationService.getAllWellLogs());
            view.getFrame().setTitle("FGSLOGS (Lithology Logs): " + openFile.getSelectedFile().toString());
            updateTree();
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
