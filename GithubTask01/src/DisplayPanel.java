import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class DisplayPanel extends JPanel {

    private JTextArea textArea;
    private JScrollPane scrollPane;

    public DisplayPanel(){
        textArea = new JTextArea();
        textArea.setFocusable(false);
        textArea.setEditable(false);
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        Border outer = BorderFactory.createEmptyBorder(5,5,5,5);
        Border inner = BorderFactory.createTitledBorder("Display Area: ");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);
    }

    private void initComps() {




    }
}
