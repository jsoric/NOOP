package com.josipsoric.zadatak_3.Strategy;

import java.util.List;

public interface LoadDataStrategy <E> {
    List<E> loadDataFromFile();
}
