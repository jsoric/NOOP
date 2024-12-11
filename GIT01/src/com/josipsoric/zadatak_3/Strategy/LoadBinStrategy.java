package com.josipsoric.zadatak_3.Strategy;

import javax.swing.*;
import java.io.*;
import java.util.List;

public class LoadBinStrategy implements LoadDataStrategy<Object> {

    @Override
    public List<Object> loadDataFromFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select a Binary File to Load");
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(selectedFile))) {
                List<Object> loadedData = (List<Object>) ois.readObject();
                System.out.println("Loaded data from file: " + selectedFile.getPath());
                return loadedData;
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException("Error loading data from binary file: " + e.getMessage());
            }
        } else {
            System.out.println("No file selected for loading.");
            return null;
        }
    }
}
