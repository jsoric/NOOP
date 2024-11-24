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

    public ToolBar(){
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
        saveAsBin.addActionListener(this);
        saveAsBin.setActionCommand("Save BIN");
        importBin.addActionListener(this);
        importBin.setActionCommand("Load BIN");
        saveAsText.addActionListener(this);
        saveAsText.setActionCommand("Save TXT");
        importTxt.addActionListener(this);
        importTxt.setActionCommand("Load BIN");
        clearAll.addActionListener(this);
        clearAll.setActionCommand("Clear all");
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
    }
}

