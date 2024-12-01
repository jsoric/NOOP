package com.josipsoric.zadatak_3.strategy;

public interface SaveDataStrategy {

    <E> void performSave(String filePath, ViewPanelInterface viewPanelInt);

}