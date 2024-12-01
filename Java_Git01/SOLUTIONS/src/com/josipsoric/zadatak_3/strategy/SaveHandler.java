package com.josipsoric.zadatak_3.strategy;

public class SaveHandler<E> extends SaveAbs {

    private String filePath;
    private ViewPanelInterface viewPanelInt;

    public SaveHandler(String filePath, String ext, ViewPanelInterface viewPanelInt){
        this.viewPanelInt = viewPanelInt;
        this.filePath = filePath;
        this.saveBinStrategy = new SaveBinStrategy();
        this.saveTxtStrategy = new SaveTxtStrategy();
        if (ext.equals(".bin")){
            setSaveDataStrategy(saveBinStrategy);
        }else {
            setSaveDataStrategy(saveTxtStrategy);
        }
    }

    @Override
    protected void setSaveDataStrategy(SaveDataStrategy saveDataStrategy) {
        saveDataStrategy.performSave(filePath, viewPanelInt);
    }
}
