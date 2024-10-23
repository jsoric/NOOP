package gui_calculator_pckg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveTxtStrategy implements SaveDataStrategy{
    @Override
    public <E> void saveDataToFile(String filePath, List<E> data) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath)))) {
            for(E element: data){
                bw.write((String) element);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        };

    }
}
