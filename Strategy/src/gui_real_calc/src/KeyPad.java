import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class KeyPad extends JPanel {

    private JTextArea keypadArea;

    private JButton num0;
    private JButton num1;
    private JButton num2;
    private JButton num3;
    private JButton num4;
    private JButton num5;
    private JButton num6;
    private JButton num7;
    private JButton num8;
    private JButton num9;
    private JButton numAdd;
    private JButton numSub;
    private JButton numDiv;
    private JButton numMult;
    private JButton numRes;
    private JButton numClear;


    public KeyPad(){
        Dimension dims = getPreferredSize();
        dims.height=400;
        this.setPreferredSize(dims);
        Border outer = BorderFactory.createEmptyBorder(5,5,5,5);
        Border inner = BorderFactory.createTitledBorder("");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);

        keypadArea = new JTextArea();
        setLayout(new BorderLayout());

        initComps();
        layoutComps();
    }

    public void initComps() {
        // Create a font with a larger size
        Font buttonFont = new Font("Arial", Font.BOLD, 24); // Adjust font size as needed

        // Initialize buttons
        num0 = new JButton("0");
        num1 = new JButton("1");
        num2 = new JButton("2");
        num3 = new JButton("3");
        num4 = new JButton("4");
        num5 = new JButton("5");
        num6 = new JButton("6");
        num7 = new JButton("7");
        num8 = new JButton("8");
        num9 = new JButton("9");
        numAdd = new JButton("+");
        numSub = new JButton("-");
        numDiv = new JButton("/");
        numMult = new JButton("*");
        numRes = new JButton("=");
        numClear = new JButton("C");

        // Set font, remove borders, adjust margins, and set non-focusable
        JButton[] buttons = { num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, numAdd, numSub, numDiv, numMult, numRes, numClear };
        for (JButton button : buttons) {
            button.setFont(buttonFont);                        // Set larger font to fill the button// Remove any padding around text
            button.setFocusable(false);                        // Disable focus on button
        }
    }


    public void layoutComps(){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints(); //Kreće od gornjeg lijevog kuta

        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.insets = new Insets(2, 2, 2, 2); // 2px padding on all sides

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(num7, gbc);

        gbc.gridx++;
        add(num8, gbc);

        gbc.gridx++;
        add(num9, gbc);

        gbc.gridx++;
        add(numDiv, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(num6, gbc);

        gbc.gridx++;
        add(num5, gbc);

        gbc.gridx++;
        add(num4, gbc);

        gbc.gridx++;
        add(numMult, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(num3, gbc);

        gbc.gridx++;
        add(num2, gbc);

        gbc.gridx++;
        add(num1, gbc);

        gbc.gridx++;
        add(numAdd, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(numClear, gbc);

        gbc.gridx++;
        add(num0, gbc);

        gbc.gridx++;
        add(numRes, gbc);

        gbc.gridx++;
        add(numSub, gbc);

    }
}
