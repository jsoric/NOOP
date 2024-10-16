package pcks_wildcard;

import java.util.List;

public class AnotherList {

    public <E> void addNewElement(E element, List<E> lst) {
        lst.add(element);
        System.out.println("Added new element: " + element);
    }

    public <E> void listAllElements(List<E> lst) {
        for (E element : lst) {
            System.out.println(element);
        }
    }

    // Fixed method, now properly using wildcards for flexibility
    public void addElement(Object element, List<?> lst) {
        System.out.println("Cannot add element to wildcard list: " + element);
        // We cannot directly add elements to a wildcard list, so this method is limited
    }
}
