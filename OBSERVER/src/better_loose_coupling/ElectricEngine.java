package better_loose_coupling;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starting: " + getClass().getSimpleName() + " engine!");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getSimpleName() + " stopped!");
    }
}
