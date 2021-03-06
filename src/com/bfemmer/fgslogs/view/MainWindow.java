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

package com.bfemmer.fgslogs.view;

import java.awt.Dimension;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.GroupLayout;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;

/**
 *
 * @author bfemmer
 */
public class MainWindow {
    private JFrame frame;
    private JSplitPane mainSplitPane;
    private JScrollPane treeScrollPane;
    private JTree wellTreeView;
    private JScrollPane editorScrollPane;
    private JEditorPane editorPane;
    private JToolBar mainToolBar;
    private JMenuBar mainMenuBar;
    private JMenu fileMenu;
    private JMenuItem openFileMenuItem;
    private JMenuItem openDirectoryMenuItem;
    private JMenu exportMenu;
    private JMenuItem exportSelectedMenuItem;
    private JMenuItem exportAllToJsonMenuItem;
    private JMenuItem exportAllToDatabaseMenuItem;
    private JMenuItem printMenuItem;
    private JPopupMenu.Separator fileMenuSeparator;
    private JMenuItem exitMenuItem;
    private JMenu editMenu;
    private JMenuItem copyMenuItem;
    private JMenuItem findMenuItem;
    
    public MainWindow() {
        initComponents();
        frame.setVisible(true);
    }
    
    private void initComponents() {
        frame = new JFrame();
        mainSplitPane = new JSplitPane();
        treeScrollPane = new JScrollPane();
        wellTreeView = new JTree();
        editorScrollPane = new JScrollPane();
        editorPane = new JEditorPane("text/html", null);
        mainMenuBar = new JMenuBar();
        mainToolBar = new JToolBar();
        fileMenu = new JMenu();
        openFileMenuItem = new JMenuItem();
        openDirectoryMenuItem = new JMenuItem();
        exportMenu = new JMenu();
        exportSelectedMenuItem = new JMenuItem();
        exportAllToJsonMenuItem = new JMenuItem();
        exportAllToDatabaseMenuItem = new JMenuItem();
        printMenuItem = new JMenuItem();
        fileMenuSeparator = new JPopupMenu.Separator();
        exitMenuItem = new JMenuItem();
        editMenu = new JMenu();
        copyMenuItem = new JMenuItem();
        findMenuItem = new JMenuItem();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("FGSLOGS (Lithologic Logs)");
        frame.setPreferredSize(new Dimension(900, 600));
        
        //mainToolBar

        mainSplitPane.setDividerLocation(200);
        mainSplitPane.setName("mainSplitPane");

        treeScrollPane.setName("treeScrollPane");

        wellTreeView.setName("wellTreeView");
        treeScrollPane.setViewportView(getWellTreeView());
        
        editorPane.setName("editorPane");
        editorPane.setEditable(false);
        editorScrollPane.setViewportView(editorPane);
        
        mainSplitPane.setLeftComponent(treeScrollPane);
        mainSplitPane.setRightComponent(editorScrollPane);

        mainMenuBar.setName("mainMenuBar");

        fileMenu.setText("File");
        fileMenu.setName("fileMenu");

        openFileMenuItem.setText("Open DAT File ...");
        openFileMenuItem.setName("openFileMenuItem");
        fileMenu.add(openFileMenuItem);
        
        openDirectoryMenuItem.setText("Open DAT Directory...");
        openDirectoryMenuItem.setName("openDirectoryMenuItem");
        fileMenu.add(openDirectoryMenuItem);
        
        exportMenu.setText("Export");
        exportMenu.setName("exportMenu");
        
        exportSelectedMenuItem.setText("Selected Logs to JSON ...");
        exportSelectedMenuItem.setName("exportSelectedLogsMenuItem");
        exportSelectedMenuItem.setEnabled(false);
        exportAllToJsonMenuItem.setText("All Logs to JSON ...");
        exportAllToJsonMenuItem.setName("exportAllJsonMenuItem");
        exportAllToDatabaseMenuItem.setText("All Logs to SQLite Database ...");
        exportAllToDatabaseMenuItem.setName("exportAllDatabaseMenuItem");
        exportAllToDatabaseMenuItem.setEnabled(false);
        
        exportMenu.add(exportSelectedMenuItem);
        exportMenu.add(exportAllToJsonMenuItem);
        exportMenu.add(exportAllToDatabaseMenuItem);
        exportMenu.setEnabled(false);
        fileMenu.add(exportMenu);

        printMenuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_P, InputEvent.CTRL_MASK));
        printMenuItem.setText("Print ...");
        printMenuItem.setActionCommand("Print");
        printMenuItem.setName("printMenuItem");
        printMenuItem.setEnabled(false);
        fileMenu.add(printMenuItem);
        
        fileMenu.add(fileMenuSeparator);

        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_Q, InputEvent.CTRL_MASK));
        exitMenuItem.setText("Exit");
        exitMenuItem.setName("exitMenuItem");
        fileMenu.add(exitMenuItem);

        mainMenuBar.add(fileMenu);

        editMenu.setText("Edit");
        editMenu.setName("editMenu");

        copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_C, InputEvent.CTRL_MASK));
        copyMenuItem.setText("Copy");
        copyMenuItem.setName("copyMenuItem");
        editMenu.add(copyMenuItem);

        findMenuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_F, InputEvent.CTRL_MASK));
        findMenuItem.setText("Find ...");
        findMenuItem.setName("findMenuItem");
        editMenu.add(findMenuItem);
        
        mainMenuBar.add(editMenu);

        frame.setJMenuBar(mainMenuBar);
        
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(mainSplitPane, 
                    GroupLayout.DEFAULT_SIZE, 
                    560, 
                    Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(mainSplitPane, 
                    GroupLayout.Alignment.TRAILING, 
                    GroupLayout.DEFAULT_SIZE, 
                    332, 
                    Short.MAX_VALUE)
        );

        frame.pack();
    }
    
    /**
     * @return the frame
     */
    public JFrame getFrame() {
        return frame;
    }

    /**
     * @param frame the frame to set
     */
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    /**
     * @return the openFileMenuItem
     */
    public JMenuItem getOpenFileMenuItem() {
        return openFileMenuItem;
    }
    
    /**
     * @return the openDirectoryMenuItem
     */
    public JMenuItem getOpenDirectoryMenuItem() {
        return openDirectoryMenuItem;
    }
    
    /**
     * @return the exportMenu
     */
    public JMenu getExportMenu() {
        return exportMenu;
    }
    
    /**
     * @return the exportSelectedMenuItem
     */
    public JMenuItem getExportSelectedMenuItem() {
        return exportSelectedMenuItem;
    }
    
    /**
     * @return the exportAllToJsonMenuItem
     */
    public JMenuItem getExportAllToJsonMenuItem() {
        return exportAllToJsonMenuItem;
    }

    /**
     * @return the printMenuItem
     */
    public JMenuItem getPrintMenuItem() {
        return printMenuItem;
    }

    /**
     * @return the exitMenuItem
     */
    public JMenuItem getExitMenuItem() {
        return exitMenuItem;
    }

    /**
     * @return the copyMenuItem
     */
    public JMenuItem getCopyMenuItem() {
        return copyMenuItem;
    }

    /**
     * @return the wellTreeView
     */
    public JTree getWellTreeView() {
        return wellTreeView;
    }

}
