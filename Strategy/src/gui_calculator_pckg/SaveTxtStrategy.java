package gui_calculator_pckg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveTxtStrategy implements SaveDataStrategy<String>{


    @Override
    public void saveDataToFile(String filePath, List<String> data) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath)))) {
            for(String element: data){ //moze s vise nacina upisivati ...
                bw.write(element);
                bw.newLine();
            }
            System.out.println("Data written as txt in file: "+filePath);
        } catch (IOException e) { //ako se nije moglo zapisivati  u datoteku, npr. read only.
            throw new RuntimeException(e);
        } ;
    }
}
