package com.repetitorium.pckg2_file_write_strategy;

public class ControllerContent {

    private WriteStrategy writeStrategy;
    private ReadStrategy readStrategy;

    public ControllerContent() {
        this.writeStrategy = new FileWriterStrategy();
        this.readStrategy = new BRStrategy();
        System.out.println("Default write strategy: " + writeStrategy.getClass().getSimpleName());
    }

    public void setWriteStrategy(WriteStrategy writeStrategy) {
        this.writeStrategy = writeStrategy;
        System.out.println("Write strategy set to: " + writeStrategy.getClass().getSimpleName());
    }

    public void setReadStrategy(ReadStrategy readStrategy) {
        this.readStrategy = readStrategy;
        System.out.println("Read strategy set to: " + readStrategy.getClass().getSimpleName());
    }

    public void writeContentToFile(String content, String filePath) {
        if (writeStrategy != null) {
            writeStrategy.writeToFile(content, filePath);
            System.out.println("Content written in file: " + filePath);
            System.out.println("Written with strategy: " + writeStrategy.getClass().getSimpleName());
        } else {
            System.out.println("Strategy not set!");
        }
    }

    public void readContentFromFile(String filePath) {
        if (readStrategy != null) {
            String output = readStrategy.readFromFile(filePath);
            System.out.println(output);
            System.out.println("Content read from file: " + filePath);
            System.out.println("Read with strategy: " + readStrategy.getClass().getSimpleName());
        } else {
            System.out.println("Strategy not set!");
        }
    }


}
