package com.josipsoric.zadatak_3.strategy;

public abstract class LoadAbs {

    protected LoadDataStrategy loadDataStrategy;
    protected LoadBinStrategy loadBinStrategy;
    protected LoadTxtStrategy loadTxtStrategy;

    protected abstract void setLoadDataStrategy(LoadDataStrategy loadDataStrategy);
}