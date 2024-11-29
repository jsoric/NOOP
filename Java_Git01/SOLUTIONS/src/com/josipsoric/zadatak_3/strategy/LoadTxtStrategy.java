package com.josipsoric.zadatak_3.strategy;

public class LoadTxtStrategy implements LoadDataStrategy{

    @Override
    public <E> void performLoading(String filePath, ViewPanelInterface viewPanelInt) {
        LoadSave.readFromTextFile(filePath, viewPanelInt);
    }
}