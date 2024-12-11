package com.josipsoric.zadatak_1;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private InputPanel inputPanel;
    private FontPanel fontPanel;
    private DisplayPanel displayPanel;

    public MainFrame() {
        super("Presentation App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 550);
        setLocationRelativeTo(null);
        setVisible(true);
        initComps();
        layoutComps();
        activateMainFrame();
    }

    private void initComps() {
        inputPanel = new InputPanel();
        fontPanel = new FontPanel();
        displayPanel = new DisplayPanel();
        displayPanel.setPreferredSize(new Dimension(50, 500));
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.3;

        gbc.weighty = 1.0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(inputPanel, gbc);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.4;
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(displayPanel, gbc);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.3;
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(fontPanel, gbc);
    }

    private void activateMainFrame() {
        inputPanel.setInputPanelListener(new InputPanelListener() {
            @Override
            public void sendButtonClick(String input) {
                displayPanel.addTextToViewPanel(input);
            }
        });

        fontPanel.setFontPanelListener(new FontPanelListener() {
            @Override
            public void fontSettings(String fontName, int fontSize) {
                if (fontName == null || fontName.isEmpty()) {
                    fontName = "Arial"; // Fallback to default font
                }
                Font newFont = new Font(fontName, Font.PLAIN, fontSize);
                displayPanel.setTextFont(newFont);
            }

            @Override
            public void updateDisplayWithFont(String text, String fontName, int fontSize) {
                if (fontName == null || fontName.isEmpty()) {
                    fontName = "Arial"; // Fallback to default font
                }
                Font newFont = new Font(fontName, Font.PLAIN, fontSize);
                displayPanel.setTextFont(newFont);
                displayPanel.addTextToViewPanel(text + "\n");
            }

            @Override
            public void resetSettings(String call) {
                fontPanel.resetPanel();
                inputPanel.resetPanel();
                displayPanel.deleteTextOnPanel();
            }
        });
    }

}

