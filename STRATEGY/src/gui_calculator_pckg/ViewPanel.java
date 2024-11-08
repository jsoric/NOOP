package gui_calculator_pckg;

import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel {

    private JTextArea textArea;
    private JScrollPane scrollPane;

    public ViewPanel(){
        textArea = new JTextArea();
        textArea.setFocusable(false); // Removes cursor by preventing focus
        textArea.setEditable(false); // Disables user input in the text area

        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER); // Add text area inside a scroll pane
    }

    // Add calculation data to the view panel
    public void addTextToViewPanel(CalculationFormData calcationRecord) {
        textArea.append(calcationRecord + "\n");
    }

    // Add text data from a loaded file to the view panel
    public void addTextToViewPanel(String dataTXT){
        textArea.append(dataTXT + "\n");
    }

    // Clear all text in the view panel
    public void deleteTxt(){
        System.out.println("All text is deleted.");
        textArea.selectAll();
        textArea.replaceSelection(null);
    }
}
