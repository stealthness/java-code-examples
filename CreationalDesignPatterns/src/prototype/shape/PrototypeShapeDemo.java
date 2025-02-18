package prototype.shape;

public class PrototypeShapeDemo {

    public static void main(String[] args) {
        part1();
        part2SimpleBuilder();
    }

    private static void part2SimpleBuilder() {
        SimpleShapeBuilder simpleShapeBuilder = new SimpleShapeBuilder();
        Shape circle = SimpleShapeBuilder.createShape("Circle");
        Shape circleClone = SimpleShapeBuilder.createShape(circle);
        Circle anotherCircle = (Circle) SimpleShapeBuilder.createShape(circleClone);
    }

    private static void part1() {
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setColor("red");
        circle.setRadius(15);

        Circle anotherCircle = (Circle) circle.clone();
        System.out.println(circle);
        System.out.println(anotherCircle);
        anotherCircle.setX(5);

        System.out.println(circle);
        System.out.println(anotherCircle);
    }
}
