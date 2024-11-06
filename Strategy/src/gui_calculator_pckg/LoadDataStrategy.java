package gui_calculator_pckg;

import java.util.List;

// Generic interface for loading data from a file
public interface LoadDataStrategy <E> {
    List<E> loadDataFromFile();
}
