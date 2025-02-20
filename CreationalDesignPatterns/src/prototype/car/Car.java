package prototype.car;

import java.util.Objects;

public class Car extends Vehicle{

    private Engine engine;

    protected Car(String type) {
        super(type);
    }

    protected Car(String type, Engine engine){
        this(type);
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(getType(), engine );
    }

    public String getName() {
        return this.getType();
    }

    public String getEngineName() {
        return engine.name();
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engine);
    }
}
