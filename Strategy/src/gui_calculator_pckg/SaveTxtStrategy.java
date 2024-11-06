package gui_calculator_pckg;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveTxtStrategy implements SaveDataStrategy<String> {
    String filePath;

    @Override
    public void saveDataToFile(List<String> data) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("C:\\Users\\josip.soric\\IdeaProjects\\Napredno Objektno Programiranje\\NOOP\\Strategy\\DATA"));

        fileChooser.setDialogTitle("Select a File to Save");
        int result = fileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(selectedFile))) {
                for (String element : data) {
                    bw.write(element);
                    bw.newLine();
                }
                System.out.println("Data written as txt in file: " + selectedFile.getPath());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("No file selected for saving.");
        }

    }
}