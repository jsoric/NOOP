package pcks_wildcard;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Create an instance of ListCLS with Integer type
        ListCLS<Integer> fstList = new ListCLS<>();
        fstList.addNewElement(100);
        fstList.addNewElement(200);
        fstList.addNewElement(-100);
        fstList.addNewElement(200);

        // List all elements from ListCLS
        fstList.listAllElements();

        // Create a list of UserSND objects
        List<UserSND> users = new ArrayList<>();
        users.add(new UserSND("Franko"));

        // Create an instance of AnotherList
        AnotherList anotherList = new AnotherList();

        // Use the internal list from ListCLS and pass it to AnotherList's methods
        anotherList.addNewElement(230, fstList.getList());
        anotherList.addNewElement(new UserSND("Eva"), users);

        // List all UserSND objects
        anotherList.listAllElements(users);
    }
}
