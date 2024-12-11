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
    private final SaveLoadManager<Object> binaryManager;
    private final SaveLoadManager<String> textManager;

    public MainFrame(){
        super("SimplePay");
        this.txtData = new ArrayList<>();
        this.binaryManager = new SaveLoadManager<>();
        this.textManager = new SaveLoadManager<>();
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
            switch (action) {
                case "Save TXT":
                    textManager.setSaveStrategy(new SaveTxtStrategy());
                    textManager.saveData(txtData);
                    break;

                case "Load TXT":
                    textManager.setLoadStrategy(new LoadTxtStrategy());
                    List<String> loadedTxt = textManager.loadData();
                    if (loadedTxt != null) {
                        txtData.addAll(loadedTxt);
                        viewPanel.addTextToViewPanel(String.join("\n", loadedTxt));
                    }
                    break;

                case "Save BIN":
                    binaryManager.setSaveStrategy(new SaveBinStrategy());
                    binaryManager.saveData(new ArrayList<>(txtData));
                    break;

                case "Load BIN":
                    binaryManager.setLoadStrategy(new LoadBinStrategy());
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
                    JOptionPane.showMessageDialog(MainFrame.this, "List is erased!", "Warning msg", JOptionPane.INFORMATION_MESSAGE);
                    break;

                default:
                    throw new UnsupportedOperationException("Unknown action: " + action);
            }
        });
    }
}

