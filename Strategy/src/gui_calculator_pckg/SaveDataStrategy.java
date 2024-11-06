package gui_calculator_pckg;

import java.util.List;

// Interface for saving data to a file
public interface SaveDataStrategy<E> {
    void saveDataToFile(List<E> data);
}
