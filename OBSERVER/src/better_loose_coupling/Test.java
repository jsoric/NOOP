package better_loose_coupling;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car(new ElectricEngine());
        car1.driveCar();
        Car car2 = new Car(new CombustionEngine());
        car2.driveCar();
    }
}
