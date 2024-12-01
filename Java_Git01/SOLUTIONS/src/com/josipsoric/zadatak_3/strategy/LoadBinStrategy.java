package com.josipsoric.zadatak_3.strategy;

public class LoadBinStrategy implements LoadDataStrategy{

    @Override
    public <E> void performLoading(String filePath, ViewPanelInterface viewPanelInt) {
        LoadSave.readFromBinFile(filePath, viewPanelInt);
    }
}