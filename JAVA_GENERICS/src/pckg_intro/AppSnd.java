package pckg_intro;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

public class AppSnd {
    public static void main(String[] args) {
        ArrayList<String> lst1 = new ArrayList<>();
        lst1.add("String");
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(234);
        ArrayList<User> lst3 = new ArrayList<>();
        lst3.add(new User("Name-01"));

        AUX_CLS.listString(lst1);
        AUX_CLS.listInt(lst2);
        AUX_CLS.listUsrList(lst3);



    }
}
