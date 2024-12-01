package com.josipsoric.zadatak_3.strategy;

public interface LoadDataStrategy {

    <E> void performLoading(String filePath, ViewPanelInterface viewPanelInt);
}