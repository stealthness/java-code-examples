package prototype.shape;

public class Triangle extends Shape{

    private int base;
    private int height;

    Triangle() {
        this(1, 1);
    }

    private Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(Triangle target) {
        super(target);
        if (target != null) {
            this.base = target.base;
            this.height = target.height;
        }
    }


    @Override
    public Triangle clone() {
        return new Triangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Triangle triangle = (Triangle) o;

        return base == triangle.base && height == triangle.height;
    }
}
