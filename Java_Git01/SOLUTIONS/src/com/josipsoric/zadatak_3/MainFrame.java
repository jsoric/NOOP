package com.josipsoric.zadatak_3;

import com.josipsoric.zadatak_3.strategy.LoadHandler;
import com.josipsoric.zadatak_3.strategy.SaveHandler;
import com.josipsoric.zadatak_3.strategy.ToolBarListener;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formpanel;
    private ToolBar toolBar;

    private SaveHandler<String> saveHandler;
    private LoadHandler<String> loadHandler;
    private JFileChooser fileChooser;

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
        toolBar.setToolBarListener(new ToolBarListener() {
            @Override
            public void toolBarBtnClick(String btnName) {
                switch (btnName){
                    case "Save BIN":
                        System.out.println("Save Bin");

                        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                                "BIN files", "bin");
                        fileChooser.setFileFilter(filter);
                        int value = fileChooser.showSaveDialog(null);
                        if (value == JFileChooser.APPROVE_OPTION) {
                            String fileName = fileChooser.getSelectedFile().getPath();
                            saveHandler = new SaveHandler<>(fileName, ".bin", viewPanel);
                        }
                        break;
                    case "Save TXT":
                        System.out.println("Save Txt");
                        FileNameExtensionFilter filter1 = new FileNameExtensionFilter(
                                "TXT files", "txt");
                        fileChooser.setFileFilter(filter1);
                        int value1 = fileChooser.showSaveDialog(null);
                        if (value1 == JFileChooser.APPROVE_OPTION) {
                            String fileName = fileChooser.getSelectedFile().getPath();
                            saveHandler = new SaveHandler<>(fileName, ".txt", viewPanel);
                        }
                        break;
                    case "Load BIN":
                        System.out.println("Load Bin");
                        FileNameExtensionFilter filter2 = new FileNameExtensionFilter(
                                "BIN files", "bin");
                        fileChooser.setFileFilter(filter2);
                        int value2 = fileChooser.showOpenDialog(null);
                        if (value2 == JFileChooser.APPROVE_OPTION) {
                            String fileName = fileChooser.getSelectedFile().getPath();
                            loadHandler = new LoadHandler<>(fileName, ".bin", viewPanel);
                        }
                        break;
                    case "Load TXT":
                        System.out.println("Load Txt");
                        FileNameExtensionFilter filter3 = new FileNameExtensionFilter(
                                "TXT files", "txt");
                        fileChooser.setFileFilter(filter3);
                        int value3 = fileChooser.showOpenDialog(null);
                        if (value3 == JFileChooser.APPROVE_OPTION) {
                            String fileName = fileChooser.getSelectedFile().getPath();
                            loadHandler = new LoadHandler<>(fileName, ".txt", viewPanel);
                        }
                        break;
                    case "Clear all":
                        System.out.println("Clearing all");
                        viewPanel.reset();
                        break;
                }
            }
        });
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
        fileChooser = new JFileChooser();
    }

}
