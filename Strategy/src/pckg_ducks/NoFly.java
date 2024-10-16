package pckg_ducks;

public class NoFly implements Flyable{


    @Override
    public void fly() {
        System.out.println("Cant fly at all!");
    }
}
