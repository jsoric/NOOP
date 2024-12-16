package com.josipsoric.zadatak_3;

import com.josipsoric.zadatak_3.Strategy.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formpanel;
    private ToolBar toolBar;
    private final List<String> txtData;
    private SaveLoadManager<String> textManager;
    private SaveLoadManager<Object> binaryManager;


    public MainFrame(){
        super("SimplePay");
        this.txtData = new ArrayList<>();
        textManager = new SaveLoadManager<>();
        binaryManager = new SaveLoadManager<>();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(680, 570);
        setLocationRelativeTo(null);
        setVisible(true);
        initComps();
        layoutComps();
        activateMainFrame();

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

    private void activateMainFrame(){
        formpanel.setFormPanelListener(input -> {
            viewPanel.addTextToViewPanel(input);
            txtData.add(input);
        });

        toolBar.setToolbarListener(action -> {
            try {
                switch (action) {
                    case "Save TXT":
                        textManager.setStrategy("Save TXT");
                        textManager.saveData(new ArrayList<>(txtData));
                        break;

                    case "Save BIN":
                        binaryManager.setStrategy("Save BIN");
                        binaryManager.saveData(new ArrayList<>(txtData));
                        break;

                    case "Load TXT":
                        textManager.setStrategy("Load TXT");
                        List<String> loadedTxt = textManager.loadData();
                        if (loadedTxt != null) {
                            txtData.addAll(loadedTxt);
                            viewPanel.addTextToViewPanel(String.join("\n", loadedTxt));
                        }
                        break;

                    case "Load BIN":
                        binaryManager.setStrategy("Load BIN");
                        List<Object> loadedBin = binaryManager.loadData();
                        if (loadedBin != null) {
                            for (Object obj : loadedBin) {
                                txtData.add(obj.toString());
                                viewPanel.addTextToViewPanel(obj.toString());
                            }
                        }
                        break;

                    case "Clear all":
                        viewPanel.deleteTxt();
                        txtData.clear();
                        JOptionPane.showMessageDialog(this, "List is erased!", "Warning msg", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    default:
                        throw new UnsupportedOperationException("Unknown action: " + action);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}

