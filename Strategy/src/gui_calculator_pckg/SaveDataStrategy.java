package gui_calculator_pckg;

import java.util.List;

public interface SaveDataStrategy<E> { // ovdje je paramnetrizirano na razini sučelja - ova je bolje

    void saveDataToFile(String filePath, List<E> data); // prije je bilo parametrizirano na razini metode
}
