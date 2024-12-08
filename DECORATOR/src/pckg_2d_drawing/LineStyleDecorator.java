package pckg_2d_drawing;

public class LineStyleDecorator extends ShapeDecorator{

    private LINESTYLE LINESTYLE;

    protected LineStyleDecorator(BasicShape shape, LINESTYLE LINESTYLE) {
        super(shape);
        this.LINESTYLE = LINESTYLE;
    }

    @Override
    protected void decorateShape() {
        System.out.println("Decorating: " + this.basicShape + "with decorator: " + this.getClass().getSimpleName());
        System.out.println("Setting some decorated line: " + this.LINESTYLE);
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing decorated: " + this.basicShape + "with decoration: " +getClass().getSimpleName());
        System.out.println("Linestyle: " + this.LINESTYLE);
    }

    @Override
    public void resize() {
        System.out.println("Resizing decorated: " + getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "LineStyleDecorator{" +
                "basicShape=" + basicShape +
                ", linestylecolor=" + LINESTYLE +
                '}';
    }

    @Override
    public String description() {
        return "";
    }

    @Override
    public boolean isHidden() {
        return this.basicShape.isHidden();
    }

    @Override
    public void shapeName(String name) {
        System.out.println(this.basicShape + " decorated with name: " + name);

    }
}
