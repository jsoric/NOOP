package pckg_intro;

import java.util.HashMap;

public class AppTest {
    public static void main(String[] args) {
        HashMap<Integer, String> mapIntStr = new HashMap<>();
        HashMap<User, String> mapUsrStr = new HashMap<>();
        mapUsrStr.put(new User("Ime1"), "opis neki");
        mapUsrStr.put(new User("ime2"), "novi opis");

        mapIntStr.put(100, "sto");
        mapIntStr.put(5, "pet");
        mapIntStr.put(2, "dva");


    }
}
