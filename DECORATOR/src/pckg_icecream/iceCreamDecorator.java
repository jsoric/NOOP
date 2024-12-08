package pckg_icecream;

public abstract class iceCreamDecorator extends AbsIceCream{

    protected AbsIceCream component;

    protected iceCreamDecorator(String name, double uPrice, int amount, AbsIceCream component) {
        super(name, uPrice, amount);
        this.component = component;
    }

    protected abstract double decoratedPrice();

    @Override
    protected double calculatePrice() {
        double price = decoratedPrice();
        System.out.println(getClass().getSimpleName() + " decorates: " + this.component.getClass().getSimpleName());
        System.out.println("Total decorated price is: " + price);
        return price;
    }
}
