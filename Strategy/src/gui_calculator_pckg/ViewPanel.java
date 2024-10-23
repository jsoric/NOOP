package gui_calculator_pckg;

import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel {

    private JTextArea textArea;
    private JScrollPane scrollPane;

    public ViewPanel(){

        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);


    }

    public void addTextToViewPanel(CalculationFormData calcationRecord) {
        textArea.append(calcationRecord + "\n");
    }
}
