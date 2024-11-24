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
    private InputPanelListener listener;

    public InputPanel() {
        Dimension dims = getPreferredSize();
        this.setPreferredSize(dims);
        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
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

        ButtonGroup daysGroup = new ButtonGroup();
        daysGroup.add(daysChoice1);
        daysGroup.add(daysChoice2);
        daysGroup.add(daysChoice3);
        daysGroup.add(daysChoice4);
        daysGroup.add(daysChoice5);
        daysGroup.add(daysChoice6);
        daysGroup.add(daysChoice7);
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

    public void setListener(InputPanelListener listener) {
        this.listener = listener;
    }

    private void activateFormPanel() {
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();

                // Get the text from the input field
                sb.append("Input Text: ").append(inputField.getText()).append("\n");

                // Check which notifications are selected
                if (notifyChoice1.isSelected()) sb.append("Notification: mail\n");
                if (notifyChoice2.isSelected()) sb.append("Notification: sms\n");
                if (notifyChoice3.isSelected()) sb.append("Notification: messenger\n");

                // Check which day is selected
                if (daysChoice1.isSelected()) sb.append("Day: Monday\n");
                if (daysChoice2.isSelected()) sb.append("Day: Tuesday\n");
                if (daysChoice3.isSelected()) sb.append("Day: Wednesday\n");
                if (daysChoice4.isSelected()) sb.append("Day: Thursday\n");
                if (daysChoice5.isSelected()) sb.append("Day: Friday\n");
                if (daysChoice6.isSelected()) sb.append("Day: Saturday\n");
                if (daysChoice7.isSelected()) sb.append("Day: Sunday\n");

                // Notify the listener
                if (listener != null) {
                    listener.inputPanelEventOccurred(sb.toString());
                }
            }
        });
    }
}
