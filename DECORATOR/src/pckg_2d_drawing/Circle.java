package pckg_2d_drawing;

public class Circle implements BasicShape{

    boolean hidden;
    private String shapeName;

    public Circle(){
        this.hidden = false;
    }
    @Override
    public void drawShape() {
        System.out.println("Drawing: " + getClass().getSimpleName());
    }

    @Override
    public void resize() {
        System.out.println("Resizing the shape: " + getClass().getSimpleName());
    }

    @Override
    public String description() {
        return this.toString();
    }

    @Override
    public boolean isHidden() {
        return hidden;
    }

    @Override
    public void shapeName(String name) {
        this.shapeName = shapeName;
    }

    @Override
    public String toString() {
        return "Basic Circle ";
    }
}
