package pckg_home_controller;

public class TurnOnTVCommand implements Command{

    private final TV tv;

    public TurnOnTVCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void runCmd() {
        tv.turnOn();
    }

    @Override
    public void undoCmd() {
        tv.turnOff();
    }
}
