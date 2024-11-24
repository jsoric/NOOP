package com.josipsoric.zadatak_3;

import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel {

    private JTextArea textArea;
    private JScrollPane scrollPane;

    public ViewPanel(){
        textArea = new JTextArea();
        textArea.setFocusable(false);
        textArea.setEditable(false);

        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
    }

}