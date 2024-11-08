package pckg_ducks;

public class RubberDuck extends Duck{
    @Override
    protected void display() {
        System.out.println("Display for: "+getClass().getSimpleName());
    }

    @Override
    protected void swim() {
        System.out.println("Can only float on the water!");
    }
}
