package pckg_bounds_snd;  // Ensure this package exists in your project structure

public class User implements Comparable<User> {

    private int id;
    private static int cntID = 10;

    private String name;

    public User(String name) {
        this.name = name;
        this.id = cntID++;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    // Correct implementation of compareTo method
    @Override
    public int compareTo(User o) {
        // Comparing based on the length of the name
        if (this.name.length() > o.name.length()) {
            return 1;  // This object is larger
        } else if (this.name.length() < o.name.length()) {
            return -1; // The other object is larger
        } else {
            return 0;  // They are equal
        }
    }
}
