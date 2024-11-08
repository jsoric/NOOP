package gui_real_calc.src;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class DisplayPanel extends JPanel {

    private JTextArea displayArea;

    public DisplayPanel(){
        Dimension dims = getPreferredSize();
        dims.height=115;
        this.setPreferredSize(dims);
        Border outer = BorderFactory.createEmptyBorder(5,5,5,5);
        Border inner = BorderFactory.createTitledBorder("");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);

        displayArea = new JTextArea();
        setLayout(new BorderLayout());
    }
}
