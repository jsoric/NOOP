package pcks_wildcard;

public class UserSND {
    private String name;

    public UserSND(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserSND{" +
                "name='" + name + '\'' +
                '}';
    }
    public String getName(){
        return this.name;
    }
}
