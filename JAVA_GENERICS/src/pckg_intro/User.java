package pckg_intro;

public class User {

    private int id;
    private static int cntID = 100;
    private String name;

    public User(String name){
        this.name = name;
        id = cntID++;

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
