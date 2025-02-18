package inspection;

/**
 * This class is used to demonstrate the use of reflection in Java.
 */
public class Foo {

    public String name;
    protected int number;

    // Constructor

    public Foo() {
        this(0);
        System.out.println("Foo constructor");
    }

    public Foo(int n) {
        System.out.println("Foo constructor with int");
    }

    // Methods

    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB(String s) {
        System.out.println("Method B with string: " + s);
    }

    public void methodB(int n) {
        System.out.println("Method B with an int: " + n);
    }
}
