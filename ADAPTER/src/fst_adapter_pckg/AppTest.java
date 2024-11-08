package fst_adapter_pckg;

import java.util.*;

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
        Enumeration enumString = new StringTokenizer("This is some string for tokenization.");
        AdapterEnumeration<String> adapterEnumeration = new AdapterEnumeration<String>(enumString);

        Client<String> sndClient = new Client<>(adapterEnumeration);
//        sndClient.someInfo();
        sndClient.removeFetchedElement();
        sndClient.someInfo();
    }
}
