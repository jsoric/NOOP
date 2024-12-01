package com.josipsoric.zadatak_1;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class DisplayPanel extends JPanel {

    private JTextArea textArea;
    private JScrollPane scrollPane;
    private Font font;

    public DisplayPanel(){
        initComps();
        layoutComps();
    }

    private void initComps() {
        textArea = new JTextArea();
        textArea.setFocusable(false);
        textArea.setEditable(false);
        textArea.setPreferredSize(new Dimension(320, 460));

        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(320, 460));

        Border outer = BorderFactory.createEmptyBorder(1,1,1,1);
        Border inner = BorderFactory.createTitledBorder("Display Area: ");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        add(scrollPane);
    }

    public void addTextToViewPanel(String dataText){
        textArea.setFont(font);
        textArea.append(dataText);
    }
    public void deleteTextOnPanel(){
        textArea.setText("");
    }


    public void setTextFont(Font font) {
        this.font=font;
    }

}
