package composite.shape;

import java.awt.*;

public class Dot extends BasicShape{

    public Dot(Point p) {
        location = p;
    }

    @Override
    public void draw(Graphics graphics) {
        super.draw(graphics);
        graphics.fillRect(location.getX() - 1, location.getY() - 1, getWidth(), getHeight());
    }

    @Override
    public Point getCenter() {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void move(Point point) {

    }

    @Override
    public boolean isInsideBounds(Point point) {
        return false;
    }

    @Override
    public void select() {

    }

    @Override
    public void unSelect() {

    }

    @Override
    public boolean isSelected() {
        return false;
    }
}
