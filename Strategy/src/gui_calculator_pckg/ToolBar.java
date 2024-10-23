package gui_calculator_pckg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel implements ActionListener {

    private JButton saveAsText;
    private JButton saveObjects;
    private JButton loadText;
    private JButton loadObjects;
    private JButton clearAll;

    public ToolBar(){
        initComps();
        layoutComps();
        activateToolBar();
    }

    private void initComps() {
        this.saveAsText = new JButton("Save txt");
        this.saveObjects = new JButton("Save bin");
        this.loadObjects = new JButton("Load bin");
        this.loadText = new JButton("Load txt");
        this.clearAll = new JButton("Clear all");


    }

    private void layoutComps() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(saveAsText);
        add(saveObjects);
        add(loadText);
        add(loadObjects);
        add(clearAll);
    }

    private void activateToolBar() {
        saveAsText.addActionListener(this);
        saveAsText.setActionCommand("Save TXT");
        saveObjects.addActionListener(this);
        saveObjects.setActionCommand("Save BIN");
        loadText.addActionListener(this);
        loadText.setActionCommand("Load TXT");
        loadObjects.addActionListener(this);
        loadObjects.setActionCommand("Load BIN");
        clearAll.addActionListener(this);
        clearAll.setActionCommand("Clear all");

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}
