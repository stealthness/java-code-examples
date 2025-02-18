package prototype.shape;

public class Circle extends Shape{

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;

    Circle() {
        this(1);
    }

    private Circle(int radius) {
        this.radius = radius;
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }


    @Override
    public Shape clone() {
            return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        return radius == circle.radius;
    }
}
