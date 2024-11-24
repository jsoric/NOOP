package com.josipsoric.zadatak_3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {

    private JTextField usernameField;
    private JTextField emailField;
    private JComboBox paymentBox;
    private JComboBox categoryBox;
    private JButton confirmButton;
    private JScrollPane jscrollPane;
    JList<String> itemList = new JList<>();


    public FormPanel() {
        Dimension dims = getPreferredSize();
        dims.height = 220;
        this.setPreferredSize(dims);

        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border inner = BorderFactory.createTitledBorder("Input data");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);

        initComps();
        layoutComps();
    }

    private void initComps() {
        usernameField = new JTextField(10);

        emailField = new JTextField(10);

        jscrollPane = new JScrollPane(itemList);


        String paymentOptions [] = {"PayPal", "E - wallet", "BitCoin", "Credit Card"};
        paymentBox = new JComboBox(paymentOptions);

        String categoryOptions [] = {"TV", "Shoes", "Jackets", "PCs"};
        categoryBox = new JComboBox(categoryOptions);

        confirmButton = new JButton("Confirm");
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(0,15,5,15);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Category"),gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(categoryBox,gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(new JLabel("Items"),gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(jscrollPane,gbc);

        gbc.weighty=0;
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(new JLabel("Username"),gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        add(usernameField,gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        add(new JLabel("Email"),gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        add(emailField,gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        add(new JLabel("Payment"),gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        add(paymentBox,gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        add(new JButton("Confirm"),gbc);

    }
}