package prototype.car;

public class VehicalDemo {

    public static final Engine FORD_ENGINE = new Engine("Ford V8 Special", "Ford", 240.0);
    public static final Engine COSWORTH_ENGINE = new Engine("F1 V12", "Coswroth", 840.0);

    public static void main(String[] args) {
        car();
        bus();
    }

    private static void bus() {

        System.out.println("BUS");

        Vehicle bus = new Bus("DoubleDecker", 120);
        Bus miniVan = new Bus("Mini van", 12);
        Bus clonedBus = (Bus) bus.clone();
        Bus clonedMiniVan = miniVan.clone();

        System.out.println("bus : " + bus);
        System.out.println("cloned bus : " + clonedBus);
        System.out.println("Is bus equal to clonedBus (expect true) : " + bus.equals(clonedBus));
        System.out.println("Is bus == clonedBus (expect false) c: " + (bus == clonedBus));


        System.out.println("mini van : " + miniVan);
        System.out.println("cloned mini van : " + clonedMiniVan);
        System.out.println("Is miniVan equal to clonedMiniVan (expect true) : " + miniVan.equals(clonedMiniVan));
        System.out.println(miniVan == clonedMiniVan);
    }

    private static void car() {
        System.out.println("Car");
        Car originalCar = new Car("Model S", FORD_ENGINE);
        Car clonedCar = originalCar.clone();

        System.out.println("Original Car: " + originalCar.getType() + " - " + originalCar.getEngineName());
        System.out.println("Cloned Car: " + clonedCar.getType() + " - " + clonedCar.getEngineName());

        System.out.println("Original Car : " + originalCar);  // using toString() method which will be overridden
        System.out.println("cloned Car : " + clonedCar);

        System.out.println("Is oringinalCar equal to clonedCar (expect true) : " + originalCar.equals(clonedCar));
        System.out.println("Is oringinalCar == clonedCar (expect false) : " + (originalCar == clonedCar));
    }

}
