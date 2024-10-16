package pckg_intro;

import java.util.ArrayList;

public class AppIntro {
    public static void main(String[] args) {
        ArrayList lst = new ArrayList();
        lst.add(100);
        lst.add("Something");
        lst.add(23.57);
        lst.add(2E11);
        lst.add(new User("Zoki"));

        listElementsFromList(lst);
        System.out.println(new User("Ime1"));
        System.out.println(new User("Ime2"));

    }

    private static void listElements(ArrayList lista) {
        int lng = lista.size();
        for(int k = 0; k < lng; k++){
            System.out.println("Elements: "+lista.get(k));
        }

    }

    private static <K> void listElementsFromList(ArrayList <K> lst){
        for(K user: lst){
            System.out.println(user);
        }
    }



}

