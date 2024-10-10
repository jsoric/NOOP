package pckg_bounds;

public class User extends Person {

    private int id;
    private static int cntID = 10;

    // Constructor for User class
    public User(String name) {
        super(name);  // Call the superclass constructor to initialize 'name'
        this.id = cntID++;
    }

    // Implementing the abstract method from Person
    @Override
    public void someMethod(String content) {
        System.out.println("User: " + name + " - " + content);
    }

    // Additional method in User class
    public void performSomething() {
        System.out.println(getClass().getSimpleName() + " performs something.");
    }
}
