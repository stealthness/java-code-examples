package prototype.car;

import java.util.Objects;


/**
 * This is an abstract class of vehicle, provides abstract method clone, this will allow us to create new class objects
 * This is part of the Prototyping pattern
 */
public abstract class Vehicle implements Cloneable{

    private final String type;

    protected Vehicle(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }


    @Override
    public abstract Vehicle clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(type, vehicle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
