package com.josipsoric.zadatak_3.Strategy;

import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class SaveBinStrategy implements SaveDataStrategy<Object> {

    @Override
    public void saveDataToFile(List<Object> data) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select a File to Save");
        int result = fileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(selectedFile))) {
                oos.writeObject(data);
                System.out.println("Data saved as binary in file: " + selectedFile.getPath());
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("Error saving data to binary file: " + e.getMessage());
            }
        } else {
            System.out.println("No file selected for saving.");
        }
    }
}
