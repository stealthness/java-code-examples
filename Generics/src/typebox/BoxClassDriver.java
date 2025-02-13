package typebox;

/**
 * This class is used to test the BoxClass class and show why generics was introduced.
 */
public class BoxClassDriver {

    public static void main(String[] args) {
        IntBox intBox = new IntBox(5);
        DoubleBox doubleBox = new DoubleBox(5.0);
        StringBox stringBox = new StringBox("five");
        // ObjectBox objectBox = stringBox;
        ObjectBox objectBoxString = new ObjectBox("five");
        ObjectBox objectBoxInt = new ObjectBox(5);

        // This is a lot of code to do the same thing for different types

        System.out.println("intBox has value : " + intBox.getValue());
        System.out.println("doubleBox has value : " + doubleBox.getValue());
        System.out.println("stringBox has value : " + stringBox.getValue());

        System.out.println("length stringBox is : " + stringBox.getValue().length());
        System.out.println("length objectBoxString is : " + ((String)objectBoxString.getValue()).length());
        System.out.println("length objectBoxInt is : " + ((String)objectBoxInt.getValue()).length()); // compiles but will throw a runtime exception
    }



}

class IntBox {
    private int value;

    public IntBox(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class DoubleBox {
    private double value;

    public DoubleBox(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

class StringBox {
    private String value;

    public StringBox(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

class ObjectBox{
    private Object value;

    public ObjectBox(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}

// for any other type, we would have to create a new class for it
