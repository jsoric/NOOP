package pckg_2d_drawing;

public abstract class ShapeDecorator implements BasicShape {

    protected BasicShape basicShape;

    protected ShapeDecorator(BasicShape shape){
        this.basicShape = shape;
    }

    protected abstract void decorateShape();
}
