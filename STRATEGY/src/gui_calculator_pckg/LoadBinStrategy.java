package gui_calculator_pckg;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoadBinStrategy implements LoadDataStrategy<CalculationFormData> {
    String filePath;

    @Override
    public List<CalculationFormData> loadDataFromFile() {
        List<CalculationFormData> dataList = new ArrayList<>();

        // Use JFileChooser for file selection
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("C:\\Users\\josip.soric\\IdeaProjects\\Napredno Objektno Programiranje\\NOOP\\Strategy\\DATA"));
        fileChooser.setDialogTitle("Select a File to Load");

        // Display file chooser dialog
        int result = fileChooser.showOpenDialog(null);

        // Check if user approved file selection
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            filePath = selectedFile.getAbsolutePath();

            // Load data from the selected file
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
                while (true) {
                    try {
                        CalculationFormData data = (CalculationFormData) ois.readObject();
                        dataList.add(data);
                    } catch (EOFException e) {
                        break; // End of file reached
                    }
                }
                System.out.println("Data loaded from binary file: " + filePath);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Load operation was canceled.");
        }

        return dataList;
    }
}
