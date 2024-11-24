package com.josipsoric.zadatak_1;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputPanel extends JPanel {

    private JTextField inputField;
    private JCheckBox notifyChoice1;
    private JCheckBox notifyChoice2;
    private JCheckBox notifyChoice3;

    private JRadioButton daysChoice1;
    private JRadioButton daysChoice2;
    private JRadioButton daysChoice3;
    private JRadioButton daysChoice4;
    private JRadioButton daysChoice5;
    private JRadioButton daysChoice6;
    private JRadioButton daysChoice7;
    private JButton sendButton;
    private DisplayPanel displayPanel;

    public String getResultData() {
        return resultData;
    }

    private String resultData;


    public InputPanel(){
        this.displayPanel = displayPanel;
        Dimension dims = getPreferredSize();
        this.setPreferredSize(dims);
        Border outer = BorderFactory.createEmptyBorder(5,5,5,5);
        Border inner = BorderFactory.createTitledBorder("Input Data: ");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);

        initComps();
        layoutComps();
        activateFormPanel();
    }

    private void initComps() {
        this.inputField = new JTextField();
        this.notifyChoice1 = new JCheckBox("mail");
        this.notifyChoice2 = new JCheckBox("sms");
        this.notifyChoice3 = new JCheckBox("messenger");
        this.daysChoice1 = new JRadioButton("Monday");
        this.daysChoice2 = new JRadioButton("Tuesday");
        this.daysChoice3 = new JRadioButton("Wednesday");
        this.daysChoice4 = new JRadioButton("Thursday");
        this.daysChoice5 = new JRadioButton("Friday");
        this.daysChoice6 = new JRadioButton("Saturday");
        this.daysChoice7 = new JRadioButton("Sunday");
        sendButton = new JButton("Send");


    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;
        add(inputField, gbc);

        gbc.fill = GridBagConstraints.NONE; //
        gbc.weightx = 0.0;
        gbc.weighty = 0.0;

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(notifyChoice1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(notifyChoice2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(notifyChoice3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(daysChoice1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(daysChoice2, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(daysChoice3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        add(daysChoice4, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        add(daysChoice5, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        add(daysChoice6, gbc);

        gbc.gridx = 1;
        gbc.gridy = 7;
        add(daysChoice7, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        add(sendButton, gbc);
    }

    // Activate the form by adding action listeners to components
    private void activateFormPanel() {
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    resultData = inputField.getText();

            }
        });
    }
}

