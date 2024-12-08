package pckg_2d_drawing;

public class ShapeLineColorDecorator extends ShapeDecorator{

    private SHAPECOLOR lineColor;

    protected ShapeLineColorDecorator(BasicShape shape, SHAPECOLOR lineColor) {
        super(shape);
        this.lineColor = lineColor;
    }

    // not standard in decorator pattern
    public void setShapeToDecorate(BasicShape shape){
        this.basicShape = shape;
    }

    @Override
    protected void decorateShape() {
        System.out.println("Decorating: " + this.basicShape + "with color: "+this.lineColor);
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing: "+this.basicShape + " decorated with: "+getClass().getSimpleName());
        System.out.println("Line color: "+this.lineColor);
    }

    @Override
    public void resize() {
        System.out.println("Resizing decorated shape");
    }

    @Override
    public String toString() {
        return "ShapeLineColorDecorator{" +
                "lineColor=" + lineColor +
                ", basicShape=" + basicShape +
                '}';
    }

    @Override
    public String description() {
        return this.toString();
    }

    @Override
    public boolean isHidden() {
        return false;
    }

    @Override
    public void shapeName(String name) {
        System.out.println("Decorated shape name: " + name);
    }
}
