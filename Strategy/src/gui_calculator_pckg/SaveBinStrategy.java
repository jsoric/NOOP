package gui_calculator_pckg;

import javax.swing.*;
import java.io.*;
import java.util.List;

public class SaveBinStrategy implements SaveDataStrategy<CalculationFormData> {
    String filePath;

    @Override
    public void saveDataToFile(List<CalculationFormData> data) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("C:\\Users\\josip.soric\\IdeaProjects\\Napredno Objektno Programiranje\\NOOP\\Strategy\\DATA"));
        // Set dialog title and show save dialog
        fileChooser.setDialogTitle("Select a File to Save");
        int result = fileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            filePath = selectedFile.getAbsolutePath();

            if (!filePath.endsWith(".bin")) {
                filePath += ".bin"; // Append .bin extension if not present
            }

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
                for (CalculationFormData element : data) {
                    oos.writeObject(element);
                }
                System.out.println("Data saved in binary format to file: " + filePath);
            } catch (IOException e) {
                throw new RuntimeException("Error saving data to binary file", e);
            }
        } else {
            System.out.println("Save operation was canceled.");
        }
    }
}
