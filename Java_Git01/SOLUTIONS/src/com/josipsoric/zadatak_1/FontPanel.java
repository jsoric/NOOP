package com.josipsoric.zadatak_1;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontPanel extends JPanel implements ActionListener {

    private JList<String> fontList;
    private JScrollPane jscrollPane;
    private JComboBox fontStyle;
    private JSlider fontSizeSlider;
    private JButton confirmButton;
    private JButton resetButton;
    private FontPanelListener fontPanelListener;

    public FontPanel() {
        Dimension dims = getPreferredSize();
        this.setPreferredSize(dims);
        Border outer = BorderFactory.createEmptyBorder(1, 1, 1, 1);
        Border inner = BorderFactory.createTitledBorder("Font Data: ");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);
        initComps();
        layoutComps();
        acivateComps();
    }

    public void setFontPanelListener(FontPanelListener fontPanelListener) {
        this.fontPanelListener = fontPanelListener;
    }

    private void initComps() {
        String[] fonts = {
                "Arial", "Verdana", "Tahoma", "Times New Roman", "Courier New",
                "Georgia", "Monospaced", "Comic Sans MS", "Impact", "Sans Serif"
        };

        fontList = new JList<>(fonts);
        fontList.setVisibleRowCount(4);
        fontList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jscrollPane = new JScrollPane(fontList);

        fontStyle = new JComboBox<>();
        fontStyle.addItem("Plain");
        fontStyle.addItem("Bold");
        fontStyle.addItem("Italic");
        fontStyle.addItem("Bold Italic");

        fontSizeSlider = new JSlider(JSlider.HORIZONTAL, 8, 18, 12);
        fontSizeSlider.setMajorTickSpacing(2);
        fontSizeSlider.setMinorTickSpacing(1);
        fontSizeSlider.setPaintTicks(true);
        fontSizeSlider.setPaintLabels(true);
        fontSizeSlider.setLabelTable(fontSizeSlider.createStandardLabels(2));

        confirmButton = new JButton("Confirm settings");
        resetButton = new JButton("Reset all");
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        add(jscrollPane, gbc);

        gbc.anchor = GridBagConstraints.NORTH;

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        add(fontStyle, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(fontSizeSlider, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(confirmButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(resetButton, gbc);


    }
    private void acivateComps() {
        confirmButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (fontPanelListener != null) {
            String fontName = fontList.getSelectedValue();
            int fontSize = fontSizeSlider.getValue();
            fontPanelListener.fontSettings(fontName, fontSize);
        }
    }



}