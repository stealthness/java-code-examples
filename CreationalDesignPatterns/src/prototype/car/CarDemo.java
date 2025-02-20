package prototype.car;

public class CarDemo {

    public static final Engine FORD_ENGINE = new Engine("Ford V8 Special", "Ford", 240.0);
    public static final Engine COSWORTH_ENGINE = new Engine("F1 V12", "Coswroth", 840.0);

    public static void main(String[] args) {
        Car originalCar = new Car("Model S", FORD_ENGINE);
        Car clonedCar = originalCar.clone();

        System.out.println("Original Car: " + originalCar.getType() + " - " + originalCar.getEngineName());
        System.out.println("Cloned Car: " + clonedCar.getType() + " - " + clonedCar.getEngineName());

        System.out.println("Original Car : " + originalCar);  // using toString() method which will be overridden
        System.out.println("cloned Car : " + clonedCar);

        System.out.println("Is oringinalCar equal to clonedCar (expect true)" + originalCar.equals(clonedCar));
        System.out.println("Is oringinalCar == clonedCar (expect false)" + (originalCar == clonedCar));

    }

}
