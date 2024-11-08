package gui_calculator_pckg;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        // Run the application in the Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame(); // Initialize the main application window
            }
        });
    }
}
