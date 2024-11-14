package pckg_concepts;

public class User implements ServiceSignIn {

    private int id;
    private static int cntID = 100;
    private String userName;

    public User(String userName){
        this.userName = userName;
        this.id = id;    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }

    @Override
    public void provideSignInInfo(String userName, String passwd) {
        System.out.println(userName);
        System.out.println(passwd);
    }

    public void performSomeAction(){
        System.out.println("Some Action.");
    }
}


