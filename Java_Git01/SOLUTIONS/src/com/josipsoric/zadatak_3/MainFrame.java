package com.josipsoric.zadatak_3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formpanel;
    private ToolBar toolBar;


    public MainFrame(){
        super("SimplePay");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(680, 570);
        setLocationRelativeTo(null);
        setVisible(true);

        initComps();
        layoutComps();
        activateMainFrame();
    }

    private void activateMainFrame() {
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formpanel, BorderLayout.SOUTH);
        add(toolBar, BorderLayout.NORTH);
    }

    private void initComps() {
        viewPanel = new ViewPanel();
        formpanel = new FormPanel();
        toolBar = new ToolBar();
    }

}
