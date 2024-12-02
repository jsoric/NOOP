package com.josipsoric.zadatak_3.Strategy;

import java.util.List;

public interface SaveDataStrategy<E> {
    void saveDataToFile(List<E> data);
}