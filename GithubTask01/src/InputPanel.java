import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

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


    public InputPanel(){
        Dimension dims = getPreferredSize();
        this.setPreferredSize(dims);
        Border outer = BorderFactory.createEmptyBorder(5,5,5,5);
        Border inner = BorderFactory.createTitledBorder("Input Data: ");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);

        initComps();
        layoutComps();
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


    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // General settings for all components
        gbc.anchor = GridBagConstraints.WEST; // Align components to the left

        // Add input field at the top
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL; // Allow the input field to stretch horizontally
        gbc.weightx = 1.0; // Make input field expandable horizontally
        gbc.weighty = 0.0; // Input field shouldn't take vertical extra space
        add(inputField, gbc);

        // Reset constraints for the radio buttons
        gbc.fill = GridBagConstraints.NONE; // Reset to default size
        gbc.weightx = 0.0; // Radio buttons won't expand
        gbc.weighty = 0.0;

        // Add first radio button
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(notifyChoice1, gbc);

        // Add second radio button
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(notifyChoice2, gbc);

        // Add third radio button
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
    }



}
