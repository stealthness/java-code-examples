package corejava;

/**
 * Demonstrate the generic class
 */
public class GenDemo {

    public static void main(String[] args) {
        // Create a Gen reference for Integers
        Gen<Integer> iOb;

        // Create a Gen<Integer> object and assign its reference to iOb
        iOb = new Gen<Integer>(88);

        iOb.showType();

        int v = iOb.getOb();
        System.out.println("value: " + v);

        System.out.println();

        Gen<String> strOb = new Gen<String>("Generics Test");

        strOb.showType();

        String isString = strOb.getOb();
        System.out.println("value: " + isString);

        // This will not compile
        // iOb = strOb;

        // Raw type
        Gen raw = new Gen("five");
        raw.showType();
        // Notice that the type object not String
        // We need to cast
        String stringFromCast = (String) raw.getOb();
        System.out.println("value: " + stringFromCast);

        raw = iOb;
        raw.showType();
        // this will compile but will throw a runtime exception because the type is Integer
        String notString = (String) raw.getOb();

    }


}
