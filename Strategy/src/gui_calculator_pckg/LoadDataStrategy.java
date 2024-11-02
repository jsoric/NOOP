package gui_calculator_pckg;

import java.util.List;

public interface LoadDataStrategy <E>{

    List<E> loadDataFromFile(String filePath);
}
