package pckg_ducks;

public abstract class Duck {

    protected Flyable flyable;
    protected Quackable quackable;

    public void setFlyable(Flyable flyable){
        this.flyable = flyable;
    }

    public void setQuackable(Quackable quackable){
        this.quackable = quackable;
    }

    protected abstract void display();
    protected abstract void swim();

    public void performFly(){
        this.flyable.fly();
    }

    public void performQuack(){
        this.quackable.quack();
    }
}
