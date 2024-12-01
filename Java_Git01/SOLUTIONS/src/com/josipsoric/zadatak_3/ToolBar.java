package com.josipsoric.zadatak_3;

import com.josipsoric.zadatak_3.strategy.ToolBarListener;

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

    private ToolBarListener toolBarListener;
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
        saveAsBin.setActionCommand("Save BIN");
        add(importBin);
        importBin.setActionCommand("Load BIN");
        add(saveAsText);
        saveAsText.setActionCommand("Save TXT");
        add(importTxt);
        importTxt.setActionCommand("Load TXT");
        add(clearAll);
        clearAll.setActionCommand("Clear all");
    }


    private void activateToolBar() {
        saveAsBin.addActionListener(this);
        importBin.addActionListener(this);
        saveAsText.addActionListener(this);
        importTxt.addActionListener(this);
        clearAll.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        if (toolBarListener != null){
            toolBarListener.toolBarBtnClick(ae.getActionCommand());
        }
    }

    public void setToolBarListener(ToolBarListener toolBarListener) {
        this.toolBarListener = toolBarListener;
    }
}

