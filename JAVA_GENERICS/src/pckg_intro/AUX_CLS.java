package pckg_intro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AUX_CLS {

    // Method to list Strings
    public static void listString(ArrayList<String> lst){
        if(lst.isEmpty()){
            System.out.println("Lista je prazna!");
        }else{
            for(String element: lst){
                System.out.println("element: " + element);
            }
        }
    }

    // Method to list Integers
    public static void listInt(ArrayList<Integer> lst){
        for(Integer intEl : lst){
            System.out.println("element: " + intEl);
        }
    }

    // Method to list User objects
    public static void listUsrList(ArrayList<User> lst){
        for(User usr: lst){
            System.out.println("element: " + usr);
        }
    }

    // Generic method to list any type of elements
    public static <E> void listElements(ArrayList<E> someList){
        if(someList.isEmpty()){
            System.out.println("List is empty - nothing to show");
        }else{
            for(E element : someList){
                System.out.println("element: " + element);
            }
        }
    }

    // Another generic method to list elements using an iterator
    public static <Q> void listElementsVerSnd(ArrayList<Q> someList){
        Iterator<Q> iter = someList.iterator();
        while(iter.hasNext()) {
            System.out.println("element: " + iter.next());  // Fixed missing parenthesis
        }
    }

    // Method to list elements of a HashMap
    public static <K,V> void listMapElements(HashMap<K,V> map){
        if(map.isEmpty()){
            System.out.println("Mapa je prazna");
        }else{
            System.out.println("Map details: " + Integer.toHexString(map.hashCode()));
            for(Map.Entry<K,V> entry: map.entrySet()){
                System.out.println("Key: " + entry.getKey());
                System.out.println("Value: " + entry.getValue());  // Fixed typo from "Key" to "Value"
            }
        }
    }
}
