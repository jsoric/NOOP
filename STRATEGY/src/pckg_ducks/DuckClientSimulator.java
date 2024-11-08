package pckg_ducks;

public class DuckClientSimulator {

    private Duck duck;

    public DuckClientSimulator(){
        this.duck = new RubberDuck();
        duck.setFlyable(new FlyWithRocket());
        duck.setQuackable(new MuteQuack());
    }

    public void setDuck(Duck duck) {
        this.duck = duck;
    }
    public Duck getDuck(){
        return this.duck;
    }

    @Override
    public String toString() {
        return "Client{" +
                "duck=" + duck +
                '}';
    }

    public void startSimulation(){
        System.out.println("Starting simulation for: "+this.duck.getClass().getSimpleName());
        this.duck.display();
        this.duck.swim();
        this.duck.performFly();
        this.duck.performQuack();
    }
}
