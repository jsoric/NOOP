package gui_calculator_pckg;

import java.util.List;

public interface SaveDataStrategy {

    <E> void saveDataToFile(String filePath, List<E> data);
}
