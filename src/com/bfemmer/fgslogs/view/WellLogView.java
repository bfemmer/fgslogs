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
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;

/**
 *
 * @author bfemmer
 */
public class WellLogView {
    private JFrame frame;
    private JSplitPane mainSplitPane;
    private JScrollPane treeScrollPane;
    private JTree wellTreeView;
    private JScrollPane editorScrollPane;
    private JEditorPane editorPane;
    private JMenuBar mainMenuBar;
    private JMenu fileMenu;
    private JMenuItem openMenuItem;
    private JMenuItem exportMenuItem;
    private JMenuItem printMenuItem;
    private JPopupMenu.Separator fileMenuSeparator;
    private JMenuItem exitMenuItem;
    private JMenu editMenu;
    private JMenuItem copyMenuItem;
    
    public WellLogView() {
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
        fileMenu = new JMenu();
        openMenuItem = new JMenuItem();
        exportMenuItem = new JMenuItem();
        printMenuItem = new JMenuItem();
        fileMenuSeparator = new JPopupMenu.Separator();
        exitMenuItem = new JMenuItem();
        editMenu = new JMenu();
        copyMenuItem = new JMenuItem();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("FGSLOGS (Lithology Logs)");
        frame.setPreferredSize(new Dimension(800, 600));

        mainSplitPane.setDividerLocation(150);
        mainSplitPane.setName("mainSplitPane"); // NOI18N

        treeScrollPane.setName("treeScrollPane"); // NOI18N

        getWellTreeView().setName("wellTreeView"); // NOI18N
        treeScrollPane.setViewportView(getWellTreeView());
        
        editorPane.setName("editorPane"); // NOI18N
        editorPane.setEditable(false);
        editorScrollPane.setViewportView(editorPane);
        
        mainSplitPane.setLeftComponent(treeScrollPane);
        mainSplitPane.setRightComponent(editorScrollPane);

        mainMenuBar.setName("mainMenuBar"); // NOI18N

        fileMenu.setText("File");
        fileMenu.setName("fileMenu"); // NOI18N

        openMenuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_O, InputEvent.CTRL_MASK));
        openMenuItem.setText("Open ...");
        openMenuItem.setName("openMenuItem"); // NOI18N
        fileMenu.add(openMenuItem);
        
        exportMenuItem.setText("Export to JSON ...");
        exportMenuItem.setName("exportMenuItem"); // NOI18N
        fileMenu.add(exportMenuItem);

        printMenuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_P, InputEvent.CTRL_MASK));
        printMenuItem.setText("Print");
        printMenuItem.setActionCommand("Print");
        printMenuItem.setName("printMenuItem"); // NOI18N
        fileMenu.add(printMenuItem);
        
        fileMenu.add(fileMenuSeparator);

        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_Q, InputEvent.CTRL_MASK));
        exitMenuItem.setText("Exit");
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        mainMenuBar.add(fileMenu);

        editMenu.setText("Edit");
        editMenu.setName("editMenu"); // NOI18N

        getCopyMenuItem().setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_C, InputEvent.CTRL_MASK));
        getCopyMenuItem().setText("Copy");
        getCopyMenuItem().setName("copyMenuItem"); // NOI18N
        editMenu.add(getCopyMenuItem());

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
     * @return the openMenuItem
     */
    public JMenuItem getOpenMenuItem() {
        return openMenuItem;
    }
    
    /**
     * @return the exportMenuItem
     */
    public JMenuItem getExportMenuItem() {
        return exportMenuItem;
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
