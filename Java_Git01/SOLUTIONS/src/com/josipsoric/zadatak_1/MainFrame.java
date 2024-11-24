package com.josipsoric.zadatak_1;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private InputPanel inputPanel;
    private FontPanel fontPanel;
    private DisplayPanel displayPanel;

    public MainFrame() {
        super("Presentation App");
        ImageIcon icon = new ImageIcon("Imgs/icon.png");
        setIconImage(icon.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(750, 500);
        setLocationRelativeTo(null);
        initComps();
        layoutComps();
        activateAll();
        setVisible(true);
    }

    private void initComps() {
        inputPanel = new InputPanel();
        fontPanel = new FontPanel();
        displayPanel = new DisplayPanel();
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;
        add(inputPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(fontPanel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        add(displayPanel, gbc);
    }

    private void activateAll() {
        inputPanel.setListener(new InputPanelListener() {
            @Override
            public void inputPanelEventOccurred(String resultData) {
                displayPanel.addTextToViewPanel(resultData + "\n");
            }
        });
    }
}
