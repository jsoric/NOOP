package com.josipsoric.zadatak_3.strategy;

public class SaveBinStrategy implements SaveDataStrategy{

    @Override
    public <E> void performSave(String filePath, ViewPanelInterface viewPanelInt) {
        LoadSave.writeToBinFile(filePath, viewPanelInt);
    }
}