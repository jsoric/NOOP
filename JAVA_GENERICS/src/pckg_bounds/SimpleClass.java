package pckg_bounds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleClass<T extends User> {

    private final ArrayList<T> users;

    // Default constructor initializing an empty ArrayList
    public SimpleClass() {
        this.users = new ArrayList<>();
    }

    // Constructor that accepts an array of T (where T extends User)
    public SimpleClass(T[] arrUsrs) {
        // Correct way to initialize ArrayList using Arrays.asList
        this.users = new ArrayList<>(Arrays.asList(arrUsrs));
    }

    public void performSomething(){
        if(users.isEmpty()){
            System.out.println("There is no user to perform");
        }else {
            for(T usr : users){
                usr.performSomething();
            }
        }
    }

    // Additional methods (optional, for better clarity)
    public ArrayList<T> getUsers() {
        return users;
    }

    public void addUser(T user) {
        users.add(user);
    }
}
