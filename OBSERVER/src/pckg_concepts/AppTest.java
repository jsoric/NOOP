package pckg_concepts;

public class AppTest {

    public static void main(String[] args) {
        Service service = new Service("NewsLetterService");
        service.signInToService(new User("userName-01"));
    }
}
