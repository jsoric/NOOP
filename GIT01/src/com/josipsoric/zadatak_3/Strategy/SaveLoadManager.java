package com.josipsoric.zadatak_3.Strategy;
import java.util.List;


public class SaveLoadManager<T> {

    private SaveDataStrategy<T> saveStrategy;
    private LoadDataStrategy<T> loadStrategy;

    public void setSaveStrategy(SaveDataStrategy<T> saveStrategy) {
        this.saveStrategy = saveStrategy;
    }

    public void setLoadStrategy(LoadDataStrategy<T> loadStrategy) {
        this.loadStrategy = loadStrategy;
    }

    public void saveData(List<T> data) {
        if (saveStrategy != null) {
            saveStrategy.saveDataToFile(data);
        } else {
            throw new IllegalStateException("Save strategy is not set.");
        }
    }

    public List<T> loadData() {
        if (loadStrategy != null) {
            return loadStrategy.loadDataFromFile();
        } else {
            throw new IllegalStateException("Load strategy is not set.");
        }
    }
}


