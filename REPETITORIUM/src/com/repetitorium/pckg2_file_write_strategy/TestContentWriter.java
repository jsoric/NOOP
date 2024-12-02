package com.repetitorium.pckg2_file_write_strategy;

public class TestContentWriter {
    public static void main(String[] args) {
        ControllerContent controllerContent = new ControllerContent();
        String content = "Something simple!\nNew line in content...";
        String additional = "This is something new!\nAgain, new line for example!";
        String filePath = "DATA/fst_file.txt";
        controllerContent.writeContentToFile(content, filePath);
        controllerContent.setWriteStrategy(new BWStrategy());
        controllerContent.writeContentToFile(additional, filePath);

        controllerContent.readContentFromFile(filePath);


    }
}
