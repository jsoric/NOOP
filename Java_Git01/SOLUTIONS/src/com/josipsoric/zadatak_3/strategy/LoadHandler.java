package com.josipsoric.zadatak_3.strategy;

public class LoadHandler<E> extends LoadAbs {

    private String filePath;
    private ViewPanelInterface viewPanelInt;


    public LoadHandler(String filePath, String ext, ViewPanelInterface viewPanelInt){
        this.viewPanelInt = viewPanelInt;
        this.filePath = filePath;
        this.loadBinStrategy = new LoadBinStrategy();
        this.loadTxtStrategy = new LoadTxtStrategy();
        if (ext.equals(".bin")){
            setLoadDataStrategy(loadBinStrategy);
        }else {
            setLoadDataStrategy(loadTxtStrategy);
        }
    }

    @Override
    protected void setLoadDataStrategy(LoadDataStrategy loadDataStrategy) {
        loadDataStrategy.performLoading(filePath, viewPanelInt);
    }
}
