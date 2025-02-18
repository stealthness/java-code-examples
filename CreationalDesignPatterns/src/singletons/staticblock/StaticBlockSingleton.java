package singletons.staticblock;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    // private constructor to prevent instantiation
    private StaticBlockSingleton() {
    }

    // The static block is executed when the class is loaded into memory. This is a lazy initialization of the singleton.
    // static block allows exception handling.
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
