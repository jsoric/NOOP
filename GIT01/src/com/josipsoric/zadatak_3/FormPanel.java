package com.josipsoric.zadatak_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FormPanel extends JPanel implements ActionListener {

    private JTextField usernameField;
    private JTextField emailField;
    private JComboBox<String> categoryBox;
    private JList<Item> itemList;
    private DefaultListModel<Item> listModel;
    private JScrollPane jscrollPaneItems;
    private Map<String, List<Item>> categoryItems;
    private JComboBox<String> paymentBox;
    private JButton confirmButton;
    private FormPanelListener formPanelListener;

    public void setFormPanelListener(FormPanelListener formPanelListener) {
        this.formPanelListener = formPanelListener;
    }

    public FormPanel() {
        Dimension dims = getPreferredSize();
        dims.height = 220;
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

        categoryBox = new JComboBox<>(new String[]{"TV", "Jackets", "Shoes", "PCs"});
        categoryBox.addActionListener(e -> updateItemList());

        categoryItems = new HashMap<>();
        categoryItems.put("TV", List.of(new Item("Panasonic"), new Item("Sony"), new Item("Samsung"),
                new Item("LG"), new Item("TCL"), new Item("Hisense"), new Item("Philips"), new Item("Vizio")));
        categoryItems.put("Jackets", List.of(new Item("The North Face"), new Item("Patagonia"), new Item("Columbia"),
                new Item("Arc'teryx"), new Item("Canada Goose\n"), new Item("Helly Hansen"), new Item("Marmot"), new Item("Carhartt")));
        categoryItems.put("Shoes", List.of(new Item("Nike"), new Item("Adidas"), new Item("Puma"),
                new Item("Reebok"), new Item("New Balance"), new Item("Under Armour"), new Item("Skechers"), new Item("Converse")));
        categoryItems.put("PCs", List.of(new Item("Dell"), new Item("HP"), new Item("Lenovo"),
                new Item("Apple"), new Item("Acer"), new Item("ASUS"), new Item("Microsoft"), new Item("MSI")));

        listModel = new DefaultListModel<>();
        itemList = new JList<>(listModel);
        jscrollPaneItems = new JScrollPane(itemList);

        paymentBox = new JComboBox<>(new String[]{"PayPal", "E-wallet", "BitCoin", "Credit Card"});

        confirmButton = new JButton("Confirm");
        confirmButton.addActionListener(this);
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        add(new JLabel("Category"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(categoryBox, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1;
        add(new JLabel("Items"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridheight = 3;
        gbc.weighty = 1;
        jscrollPaneItems.setPreferredSize(new Dimension(150, 100));
        add(jscrollPaneItems, gbc);

        gbc.gridheight = 1;
        gbc.weighty = 0;

        gbc.gridx = 2;
        gbc.gridy = 0;
        add(new JLabel("Username"), gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        add(usernameField, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        add(new JLabel("Email"), gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        add(emailField, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        add(new JLabel("Payment"), gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        add(paymentBox, gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        add(confirmButton, gbc);
    }

    private void updateItemList() {
        String selectedCategory = (String) categoryBox.getSelectedItem();
        List<Item> items = categoryItems.getOrDefault(selectedCategory, new ArrayList<>());

        listModel.clear();
        for (Item item : items) {
            listModel.addElement(item);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String email = emailField.getText();
        User user = new User(username, email);

        List<Item> selectedItems = itemList.getSelectedValuesList();

        String paymentMethod = (String) paymentBox.getSelectedItem();

        Purchase purchase = new Purchase(user, selectedItems,paymentMethod);

        if (formPanelListener != null) {
            formPanelListener.sendButtonClick(purchase.toString());
        }
    }
}
