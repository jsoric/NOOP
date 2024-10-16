package pckg_bounds_snd;

public class MainTest {
    public static void main(String[] args) {
        String fst = "Some simple string!";
        String snd = "This one is the second one, and it is slightly different...";
/*
        CompareTWO<String> compareStrings = new CompareTWO<>(fst,snd);
        compareStrings.compareTwo();
*/
        Integer fstInt = 120;
        Integer sndInt = 45;

        /*CompareTWO<Integer> integerCompareTWO = new CompareTWO<>(fstInt,sndInt);
        integerCompareTWO.compareTwo();
*/
        User us1 = new User("Marin Ante");
        User us2 = new User("Damir");

        CompareTWO<User> compareUsers = new CompareTWO<User>(us1,us2);
        compareUsers.compareTwo();

    }


}
