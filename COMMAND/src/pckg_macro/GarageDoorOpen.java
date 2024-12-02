package pckg_macro;

public class GarageDoorOpen implements Command{
    @Override
    public void run() {
        System.out.println("Openning garage door!");
    }

    @Override
    public void undo() {
        System.out.println("Closing garage door!");
    }
}
