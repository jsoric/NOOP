package pckg_2d_drawing;

public interface BasicShape {

    void drawShape();
    void resize();
    String description();
    boolean isHidden();
    void shapeName(String name);

}
