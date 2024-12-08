package pckg_icecream;

public abstract class AbsIceCream {

    protected String name;
    protected double price;
    protected double unitPrice;
    protected int amount;

    protected AbsIceCream(String name, double uPrice, int amount){
        this.amount = amount;
        this.unitPrice = uPrice;
        this.name = name;
    }

    protected abstract double calculatePrice();

    public void description(){
        System.out.println(getClass().getSimpleName() + " ");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AbsIceCream{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", unitPrice=" + unitPrice +
                ", amount=" + amount +
                '}';
    }


}
