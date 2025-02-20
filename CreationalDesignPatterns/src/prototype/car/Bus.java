package prototype.car;

import java.util.Objects;

public class Bus  extends Vehicle{

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private int capacity;

    protected Bus(String type) {
        super(type);
    }

    protected Bus(String type, int capacity) {
        super(type);
        this.capacity = capacity;
    }

    @Override
    public Bus clone() {
        return new Bus(this.getType(), capacity);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return capacity == bus.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity);
    }
}
