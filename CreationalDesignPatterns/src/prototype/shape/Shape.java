package prototype.shape;

public abstract class Shape implements Cloneable{

    private int x;
    private int y;
    private String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected boolean isSameColor(String color){
        return this.color.equals(color);
    }

    @Override
    public String toString() {
        return "Shape{" + "x=" + x + ", y=" + y + ", color='" + color + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        if (x != shape.x) return false;
        if (y != shape.y) return false;
        return isSameColor(shape.color);
    }
}
