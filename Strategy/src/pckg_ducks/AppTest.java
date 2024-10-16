package pckg_ducks;

public class AppTest {

    public static void main(String[] args) {
        DuckClientSimulator client = new DuckClientSimulator();
        client.startSimulation();
        System.out.println("-------------------------------------");
        client.setDuck(new MallardDuck());
        client.getDuck().setQuackable(new QuackLoud());
        client.getDuck().setFlyable(new FlyWithWings());
        client.startSimulation();

    }
}
