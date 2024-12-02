package com.josipsoric.zadatak_3;

import com.josipsoric.zadatak_3.Strategy.LoadBinStrategy;
import com.josipsoric.zadatak_3.Strategy.LoadTxtStrategy;
import com.josipsoric.zadatak_3.Strategy.SaveBinStrategy;
import com.josipsoric.zadatak_3.Strategy.SaveTxtStrategy;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formpanel;
    private ToolBar toolBar;
    private final List<String> txtData;

    public MainFrame(){
        super("SimplePay");
        this.txtData = new ArrayList<>();
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
        formpanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void sendButtonClick(String input) {
                viewPanel.addTextToViewPanel(input);
                txtData.add(input);
            }
        });

        toolBar.setToolbarListener(new ToolbarListener() {
            @Override
            public void toolbarEventOccured(String buttonActionString) {
                if(buttonActionString.equals("Save TXT")){
                    SaveTxtStrategy saveTxtStrategy = new SaveTxtStrategy();
                    saveTxtStrategy.saveDataToFile(txtData);
                }
                if(buttonActionString.equals("Load TXT")){
                    if(txtData.size() != 0){
                        SaveTxtStrategy saveTxtStrategy = new SaveTxtStrategy();
                        saveTxtStrategy.saveDataToFile(txtData);
                    }
                    LoadTxtStrategy loadDataStrategy = new LoadTxtStrategy();
                    List<String> loaded = loadDataStrategy.loadDataFromFile();
                    viewPanel.addTextToViewPanel(loaded.toString());
                }
                if(buttonActionString.equals("Save BIN")){
                    SaveBinStrategy saveBinStrategy = new SaveBinStrategy();
                    saveBinStrategy.saveDataToFile(new ArrayList<>(txtData));
                }
                if(buttonActionString.equals("Load BIN")){
                    LoadBinStrategy loadBinStrategy = new LoadBinStrategy();
                    List<Object> loadedData = loadBinStrategy.loadDataFromFile();
                    if (loadedData != null) {
                        for (Object obj : loadedData) {
                            txtData.add(obj.toString()); // Assuming txtData expects string representations
                            viewPanel.addTextToViewPanel(obj.toString());
                        }
                    }
                }
                if(buttonActionString.equals("Clear all")){
                    viewPanel.deleteTxt();
                    txtData.clear();
                    JOptionPane.showMessageDialog(MainFrame.this, "List is erased!", "Warning msg", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}
