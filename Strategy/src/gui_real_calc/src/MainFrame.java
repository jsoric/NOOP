import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private DisplayPanel displayPanel;
    private KeyPad keyPad;

    public MainFrame(){

        super("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(400, 550); //ide prije setLocationRelativeTo
        setLocationRelativeTo(null);
        setVisible(true);
        initComps();
        layoutComps();


    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(displayPanel, BorderLayout.NORTH);
        add(keyPad, BorderLayout.SOUTH);


    }

    private void initComps(){
        displayPanel = new DisplayPanel();
        keyPad = new KeyPad();
    }

}
