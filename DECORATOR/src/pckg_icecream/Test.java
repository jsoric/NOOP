package pckg_icecream;

public class Test {

    public static void main(String[] args) {

        Chocolate ch1 = new Chocolate("Chocolate", 2.0, 2);
        ch1.calculatePrice();
        ch1.description();

        HoneyOverflow honeyOverflow1 = new HoneyOverflow("Honey overflow", 0.5, 1, ch1);
        double finalPrice = honeyOverflow1.decoratedPrice();
        System.out.println("Final price: " + finalPrice);

        HazelNutPowder hazelNutPowder1 = new HazelNutPowder("HazelNut overflow", 2, 1, honeyOverflow1);
        finalPrice = hazelNutPowder1.decoratedPrice();
        System.out.println("Final price: " + finalPrice);
    }
}
