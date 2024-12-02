package com.repetitorium.pckg2_file_write_strategy;

import java.io.*;

public class BRStrategy implements ReadStrategy{
    @Override
    public String readFromFile(String filePath) {
        try(BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))){
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = br.readLine()) != null){
                sb.append(line).append("\n");
            }
            return sb.toString();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
