package com.josipsoric.zadatak_3.Strategy;
import java.util.List;

public class SaveLoadManager<T> {

    private SaveDataStrategy<T> saveStrategy;
    private LoadDataStrategy<T> loadStrategy;

    public void setStrategy(String action) {
        switch (action) {
            case "Save TXT":
                this.saveStrategy = (SaveDataStrategy<T>) new SaveTxtStrategy();
                break;
            case "Save BIN":
                this.saveStrategy = (SaveDataStrategy<T>) new SaveBinStrategy();
                break;
            case "Load TXT":
                this.loadStrategy = (LoadDataStrategy<T>) new LoadTxtStrategy();
                break;
            case "Load BIN":
                this.loadStrategy = (LoadDataStrategy<T>) new LoadBinStrategy();
                break;
            default:
                throw new UnsupportedOperationException("Unknown action: " + action);
        }
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


