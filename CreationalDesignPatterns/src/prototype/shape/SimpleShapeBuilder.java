package prototype.shape;

public class SimpleShapeBuilder {
    public static Shape createShape(Shape shape) {
        if (shape instanceof Circle) {
            return new Circle((Circle) shape);
        } else if (shape instanceof Triangle) {
            return new Triangle((Triangle) shape);
        }
        return null;
    }

    public static Shape createShape(String shapeType){
        return switch (shapeType) {
            case "Circle" -> new Circle();
            case "Triangle" -> new Triangle();
            default -> throw new IllegalArgumentException("Invalid shape type");
        };
    }
}
