package gui_calculator_pckg;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formpanel;
    private ToolBar toolBar;

    public MainFrame(){

        super("Simple calculator");
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
