package pckg_home_controller;

public class LightOnCmd implements Command{

    private Light light;

    public LightOnCmd(Light light){
        this.light = light;
    }

    @Override
    public void runCmd() {
        light.lightOn();
    }

    @Override
    public void undoCmd() {
        light.lightOff();
    }
}