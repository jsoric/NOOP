package com.josipsoric.zadatak_3;

import com.josipsoric.zadatak_3.strategy.ViewPanelInterface;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class ViewPanel extends JPanel implements ViewPanelInterface, Serializable {

    private JTextArea textArea;
    private JScrollPane scrollPane;

    private String loadedText;

    public ViewPanel(){
        loadedText = "";
        textArea = new JTextArea();
        textArea.setFocusable(false);
        textArea.setEditable(false);

        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
    }

    public void addTextToViewPanel(String dataText){
        textArea.append(dataText);
    }

    @Override
    public String getText() {
        return textArea.getText();
    }

    @Override
    public void setText(String text) {
        loadedText = text;
        textArea.setText(text);
    }

    public void reset(){
        if (!textArea.getText().contains(loadedText)){
            loadedText = "";
            System.out.println("No loaded text");
        }
        textArea.setText(loadedText);
    }
}