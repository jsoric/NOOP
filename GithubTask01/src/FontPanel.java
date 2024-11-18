import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FontPanel extends JPanel {

    private JList<String> fontList;
    private JScrollPane jscrollPane;

    public FontPanel() {
        // Set up the panel's preferred size and border
        Dimension dims = getPreferredSize();
        this.setPreferredSize(dims);
        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border inner = BorderFactory.createTitledBorder("Font Data: ");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);

        // Initialize components
        initComps();
        layoutComps();
    }

    private void initComps() {
        // Create a list of font names (example)
        String[] fonts = {
                "Arial", "Verdana", "Tahoma", "Times New Roman", "Courier New",
                "Georgia", "Monospaced", "Comic Sans MS", "Impact", "Sans Serif"
        };

        // Create a JList with the fonts
        fontList = new JList<>(fonts);
        fontList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Allow single selection
        jscrollPane = new JScrollPane(fontList);
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // General settings for all components
        gbc.anchor = GridBagConstraints.WEST; // Align components to the left
        // Add input field at the top
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        add(jscrollPane, gbc);
    }
}
