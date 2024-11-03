package gui_calculator_pckg;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoadTxtStrategy implements LoadDataStrategy<String> {

    @Override
    public List<String> loadDataFromFile(String filePath) {
        List<String> loadedData = new ArrayList<>();

        // Use JFileChooser to select a file
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select a File to Load");
        int result = fileChooser.showOpenDialog(null);

        // Check if user selected a file
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
                String line;
                while ((line = br.readLine()) != null) {
                    loadedData.add(line + "\n");
                }
                System.out.println("Finished reading from a file: " + selectedFile.getPath());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No file selected for loading.");
        }

        return loadedData;
    }
}
