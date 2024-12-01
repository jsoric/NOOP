package com.josipsoric.zadatak_3.strategy;

public class SaveTxtStrategy implements SaveDataStrategy{

    @Override
    public <E> void performSave(String filePath, ViewPanelInterface viewPanelInt) {
        LoadSave.writeToTextFile(filePath, viewPanelInt);
    }
}