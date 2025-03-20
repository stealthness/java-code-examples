package composite.shape;

public interface Shape {
    Point getCenter();
    int getWidth();
    int getHeight();
    void move(Point point);
    boolean isInsideBounds(Point point);
    void select();
    void unSelect();
    boolean isSelected();

}
