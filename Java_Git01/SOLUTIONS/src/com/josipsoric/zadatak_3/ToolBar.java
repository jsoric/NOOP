package com.josipsoric.zadatak_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ToolBar extends JPanel implements ActionListener {

        private JButton saveAsBin;
        private JButton importBin;
        private JButton saveAsText;
        private JButton importTxt;
        private JButton clearAll;
        private ToolbarListener toolbarListener;

        public void setToolbarListener(ToolbarListener toolbarListener) {
            this.toolbarListener = toolbarListener;
        }

        public ToolBar() {
            initComps();
            layoutComps();
            activateToolBar();
        }

        private void initComps() {
            this.saveAsBin = new JButton("Save bin");
            this.importBin = new JButton("Import bin");
            this.saveAsText = new JButton("Save txt");
            this.importTxt = new JButton("Import txt");
            this.clearAll = new JButton("Clear all");
        }

        private void layoutComps() {
            setLayout(new FlowLayout(FlowLayout.LEFT));
            add(saveAsBin);
            add(importBin);
            add(saveAsText);
            add(importTxt);
            add(clearAll);
        }

        private void activateToolBar() {
            saveAsText.addActionListener(this);
            saveAsText.setActionCommand("Save TXT");
            saveAsBin.addActionListener(this);
            saveAsBin.setActionCommand("Save BIN");
            importTxt.addActionListener(this);
            importTxt.setActionCommand("Load TXT");
            importBin.addActionListener(this);
            importBin.setActionCommand("Load BIN");
            clearAll.addActionListener(this);
            clearAll.setActionCommand("Clear all");
        }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == saveAsText) {
            if (toolbarListener != null) {
                toolbarListener.toolbarEventOccured(saveAsText.getActionCommand());
            }
            System.out.println("Clicked: " + saveAsText.getActionCommand());
        }

        if (ae.getSource() == saveAsBin) {
            if (toolbarListener != null) {
                toolbarListener.toolbarEventOccured(saveAsBin.getActionCommand());
            }
            System.out.println("Clicked: " + saveAsBin.getActionCommand());
        }

        if (ae.getSource() == importTxt) {
            System.out.println("Clicked: " + importTxt.getActionCommand());
            if (toolbarListener != null) {
                toolbarListener.toolbarEventOccured(importTxt.getActionCommand());
            }
        }

        if (ae.getSource() == importBin) {
            System.out.println("Clicked: " + importBin.getActionCommand());
            if (toolbarListener != null) {
                toolbarListener.toolbarEventOccured(importBin.getActionCommand());
            }
        }

        if (ae.getSource() == clearAll) {
            if (toolbarListener != null) {
                toolbarListener.toolbarEventOccured(clearAll.getActionCommand());
            }
            System.out.println("Clicked: " + clearAll.getActionCommand());
        }
    }
}

