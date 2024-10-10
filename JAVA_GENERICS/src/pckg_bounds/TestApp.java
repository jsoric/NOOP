package pckg_bounds;

public class TestApp {

    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3};
        BestUser[] users = {new BestUser("Besty"), new BestUser("Plain"), new BestUser("New User")};
        User[] user2 = {new BestUser("Besty"), new User("Plain"), new NewUser("New User")};  // Fixing type mismatch

        // Creating instances of SimpleClass with BestUser and User types
        SimpleClass<BestUser> bestUserSimpleClass = new SimpleClass<>(users);
        bestUserSimpleClass.performAllActions();  // Iterating over users to perform actions

        SimpleClass<NewUser> newUserSimpleClass = new SimpleClass<>();
        SimpleClass<User> userSimpleClass = new SimpleClass<>(user2);  // Fix type mismatch here

        System.out.println("---------------------------------------------");
        userSimpleClass.performAllActions();  // Iterating over users to perform actions
    }
}
