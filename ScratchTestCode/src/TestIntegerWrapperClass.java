public class TestIntegerWrapperClass {

    public static void main(String[] args) {
        // Below code is deprecated since Java 9
        // Integer i1 = new Integer(10);
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        // Now uses a factory method to create an Integer object
        // that represents the specified int value but now
        // guarantees that the same object is returned for the same value
        System.out.println(i1 == i2); // true
    }
}
