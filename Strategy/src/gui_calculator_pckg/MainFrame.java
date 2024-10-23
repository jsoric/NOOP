package gui_calculator_pckg;

import javax.swing.*;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formpanel;

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
    }

    private void layoutComps() {
    }

    private void initComps() {
        viewPanel = new ViewPanel();
        formpanel = new FormPanel();

    }


}
