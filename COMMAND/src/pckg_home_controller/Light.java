package pckg_home_controller;

public class Light {

    public void lightOn(){
        System.out.println(getClass().getSimpleName() + " turning light on!");
    }

    public void lightOff(){
        System.out.println(getClass().getSimpleName() + " turning light off!");
    }
}
