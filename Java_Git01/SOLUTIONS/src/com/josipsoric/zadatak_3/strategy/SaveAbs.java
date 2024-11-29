package com.josipsoric.zadatak_3.strategy;

public abstract class SaveAbs {

    protected SaveDataStrategy saveDataStrategy;
    protected SaveBinStrategy saveBinStrategy;
    protected SaveTxtStrategy saveTxtStrategy;

    protected abstract void setSaveDataStrategy(SaveDataStrategy saveDataStrategy);
}
