package pckg_icecream;

public class Chocolate extends AbsIceCream{

    protected Chocolate(String name, double uPrice, int amount) {
        super(name, uPrice, amount);
    }

    @Override
    protected double calculatePrice() {
        double price = unitPrice * amount;
        System.out.println("Price for: " + getClass().getSimpleName()+"is: "+price);
        return price;
    }
}
