package com.josipsoric.zadatak_1;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontPanel extends JPanel implements ActionListener {

    private JList<String> fontList;
    private JScrollPane jscrollPane;
    private JComboBox<String> fontStyle;
    private JSlider fontSizeSlider;
    private JButton confirmButton;
    private JButton resetButton;
    private FontPanelListener fontPanelListener;

    public void setFontPanelListener(FontPanelListener fontPanelListener) {
        this.fontPanelListener = fontPanelListener;
    }

    public FontPanel() {
        Dimension dims = getPreferredSize();
        this.setPreferredSize(dims);
        Border outer = BorderFactory.createEmptyBorder(1, 1, 1, 1);
        Border inner = BorderFactory.createTitledBorder("Font Data: ");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);
        initComps();
        layoutComps();
        activateComps();
    }

    private void initComps() {

        String[] fonts = {
                "Arial", "Verdana", "Tahoma", "Times New Roman", "Courier New",
                "Georgia", "Monospaced", "Comic Sans MS", "Impact", "Sans Serif"
        };

        fontList = new JList<>(fonts);
        fontList.setVisibleRowCount(4);
        fontList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        fontStyle = new JComboBox<>();
        fontStyle.addItem("Plain");
        fontStyle.addItem("Bold");
        fontStyle.addItem("Italic");
        fontStyle.addItem("Bold Italic");

        jscrollPane = new JScrollPane(fontList);
        jscrollPane.setPreferredSize(new Dimension(fontStyle.getWidth(), fontStyle.getHeight()));

        fontSizeSlider = new JSlider(JSlider.HORIZONTAL, 8, 18, 12);
        fontSizeSlider.setMajorTickSpacing(2);
        fontSizeSlider.setMinorTickSpacing(1);
        fontSizeSlider.setPaintTicks(true);
        fontSizeSlider.setPaintLabels(true);
        fontSizeSlider.setLabelTable(fontSizeSlider.createStandardLabels(2));

        confirmButton = new JButton("Confirm settings");

        resetButton = new JButton("Reset all");
        resetButton.setActionCommand("reset");
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 0.3;
        add(jscrollPane, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 0.1;
        add(fontStyle, gbc);

        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.weighty = 0.2;
        add(fontSizeSlider, gbc);

        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.1;
        add(confirmButton, gbc);

        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(resetButton, gbc);
    }

    private void activateComps() {
        confirmButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (fontPanelListener != null && e.getSource() == confirmButton) {
            String fontName = fontList.getSelectedValue();
            if (fontName == null || fontName.isEmpty()) {
                fontName = "Arial";
            }

            int fontSize = fontSizeSlider.getValue();

            String displayText = "Font applied: " + fontName + ", Size: " + fontSize;

            fontPanelListener.updateDisplayWithFont(displayText, fontName, fontSize);
        }
        if (e.getActionCommand().equals("reset")) {
            fontPanelListener.resetSettings(e.getActionCommand());
        }
    }



    public void resetPanel(){
        fontStyle.setSelectedIndex(0);
        fontSizeSlider.setValue(12);
        fontList.clearSelection();
    }

}