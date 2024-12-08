package pckg_2d_drawing;

public class Test2DDrawing {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.drawShape();

        ShapeFillColorDecorator colorDecorator = new ShapeFillColorDecorator(circle, SHAPECOLOR.Green);
        colorDecorator.drawShape();
        System.out.println(colorDecorator);

        ShapeLineColorDecorator lineColorDecorator = new ShapeLineColorDecorator(colorDecorator, SHAPECOLOR.Magenta);
        lineColorDecorator.drawShape();
        System.out.println(lineColorDecorator);
        System.out.println(circle.description());
/*
        LineStyleDecorator lineStyleDecorator = new LineStyleDecorator(new ShapeLineColorDecorator(new ShapeFillColorDecorator(circle, SHAPECOLOR.Green)));
        lineStyleDecorator.drawShape();
        System.out.println(lineStyleDecorator);
*/


    }
}
