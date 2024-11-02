package fst_adapter_pckg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppTest {

    public static void main(String[] args) {
        String [] strings = {"a", "b", "c", "d", "e"};
        ArrayList<String> stringList= new ArrayList<>();
        stringList.addAll(List.of("a", "b", "c", "d", "e"));
        Client<String> clientFst = new Client<>(stringList.iterator());
//        clientFst.someInfo();
        clientFst.removeFetchedElement();
        System.out.println("After removal...");
        clientFst.someInfo();
    }
}
