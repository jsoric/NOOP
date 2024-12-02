package tight_loose;

public class Car {

    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public void driveCar(){
        engine.startEngine();
        System.out.println("Car is driving!");
    }
}
