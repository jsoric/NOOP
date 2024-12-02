package pckg_macro;

public class GarageLightOn implements Command{
    @Override
    public void run() {
        System.out.println("Garage light is on!");
    }

    @Override
    public void undo() {
        System.out.println("Garage light is off!");
    }
}
