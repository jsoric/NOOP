package pckg_icecream;

public class HazelNutPowder extends iceCreamDecorator{
    protected HazelNutPowder(String name, double uPrice, int amount, AbsIceCream component) {
        super(name, uPrice, amount, component);
    }

    @Override
    protected double decoratedPrice() {
        double basePrice = this.component.calculatePrice();
        double decorationPrice = this.unitPrice * this.amount;
        double totalPrice = basePrice + decorationPrice;
        System.out.println(getClass().getSimpleName() + " adds decoration price: " + decorationPrice);
        return totalPrice;
    }
}
