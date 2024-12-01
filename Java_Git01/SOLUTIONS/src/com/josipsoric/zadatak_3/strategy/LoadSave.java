package com.josipsoric.zadatak_3.strategy;

import com.josipsoric.zadatak_3.strategy.ViewPanelInterface;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class LoadSave {

    public static <E> void readFromTextFile(String path, ViewPanelInterface viewPanelInt){
        StringBuffer sb = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new FileReader(new File(path)))){
            String line;
            while ((line = br.readLine()) != null){
                sb.append(line).append("\n");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(sb);
        viewPanelInt.setText(String.valueOf((sb)));
    }

    public static <E> void writeToTextFile(String path, ViewPanelInterface viewPanelInt){
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(path), StandardCharsets.UTF_8))) {
            String text = viewPanelInt.getText();
            writer.write(text);
            System.out.println("Saved!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to save data!");
        }
    }

    public static <E> void writeToBinFile(String path, ViewPanelInterface viewPanelInt){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(path), true))){
            String text = viewPanelInt.getText();
            oos.writeObject(text);
            System.out.println("Saved!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static <E> void readFromBinFile(String path, ViewPanelInterface viewPanelInt){
        StringBuffer sb = new StringBuffer();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(path)))){
            while (true){
                E dat = (E) ois.readObject();
                sb.append(dat + "\n");
            }
        } catch (EOFException e){
        } catch (Exception e){
            e.printStackTrace();
        }
        viewPanelInt.setText(String.valueOf(sb));
        System.out.println(sb);
    }

    public static String fileExtension(String path){
        return path.substring(path.lastIndexOf(".") + 1);
    }
}