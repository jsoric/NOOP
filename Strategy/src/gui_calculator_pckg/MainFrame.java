package gui_calculator_pckg;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formpanel;
    private ToolBar toolBar;
    private final List<String> txtData;

    public MainFrame(){

        super("Simple calculator");
        this.txtData = new ArrayList<>();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(680, 570);
        setVisible(true);

        initComps();
        layoutComps();
        activateMainFrame();


    }

    private void activateMainFrame() {
        formpanel.setFormPanelListener(new FormPanelListener() { //Anonimna klasa, proučit!!
            @Override
            public void formPanelEventOccured(CalculationFormData formRecord) {
                viewPanel.addTextToViewPanel(formRecord);
                txtData.add(formRecord.toString());
            }
        });
        toolBar.setToolbarListener(new ToolbarListener() {
            @Override
            public void toolbarEventOccured(String buttonActionString) {
                if(buttonActionString.equals("Save TXT")){
                    SaveTxtStrategy saveTxtStrategy = new SaveTxtStrategy();
                    saveTxtStrategy.saveDataToFile("dataTXT.txt", txtData);
                }
                if(buttonActionString.equals("Clear all")){
                    viewPanel.deleteTxt();
                    txtData.clear();
                    JOptionPane.showMessageDialog(MainFrame.this, "List is erased!", "Warning msg", JOptionPane.INFORMATION_MESSAGE);
                }
                if(buttonActionString.equals("Load TXT")){
                    System.out.println("Load works");
                    LoadTxtStrategy loadDataStrategy = new LoadTxtStrategy();
                    List<String> loaded = loadDataStrategy.loadDataFromFile("dataTXT.txt");
                    viewPanel.addTextToViewPanel(loaded.toString());
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

    }

}
