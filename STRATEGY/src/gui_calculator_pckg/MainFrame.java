package gui_calculator_pckg;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formpanel;
    private ToolBar toolBar;
    private final List<String> txtData;
    private final List<CalculationFormData> binData;

    public MainFrame(){
        super("Simple calculator");

        this.txtData = new ArrayList<>();
        this.binData = new ArrayList<>();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(680, 570);
        setLocationRelativeTo(null);
        setVisible(true);

        initComps();
        layoutComps();
        activateMainFrame();
    }

    // Set up listeners for main frame components
    private void activateMainFrame() {
        formpanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void formPanelEventOccured(CalculationFormData formRecord) {
                viewPanel.addTextToViewPanel(formRecord);
                txtData.add(formRecord.toString());
                binData.add(formRecord);
            }
        });

        toolBar.setToolbarListener(new ToolbarListener() {
            @Override
            public void toolbarEventOccured(String buttonActionString) {
                if(buttonActionString.equals("Save TXT")){
                    SaveTxtStrategy saveTxtStrategy = new SaveTxtStrategy();
                    saveTxtStrategy.saveDataToFile(txtData);
                }
                if(buttonActionString.equals("Save BIN")){
                    SaveBinStrategy saveBinStrategy = new SaveBinStrategy();
                    saveBinStrategy.saveDataToFile(binData);
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
                if(buttonActionString.equals("Load BIN")){
                    LoadBinStrategy loadBinStrategy = new LoadBinStrategy();
                    List<CalculationFormData> loaded = loadBinStrategy.loadDataFromFile();
                    viewPanel.addTextToViewPanel(loaded.toString());
                }
                if(buttonActionString.equals("Clear all")){
                    viewPanel.deleteTxt();
                    txtData.clear();
                    binData.clear();
                    JOptionPane.showMessageDialog(MainFrame.this, "List is erased!", "Warning msg", JOptionPane.INFORMATION_MESSAGE);
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
