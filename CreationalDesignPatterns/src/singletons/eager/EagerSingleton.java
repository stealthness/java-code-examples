package singletons.eager;

public class EagerSingleton {

    // Eager initialization of a singleton. The instance is created when the class is loaded. This implementation is thread-safe.
    // However, it is not efficient because the instance is created even if it is not needed.
    private static final EagerSingleton instance = new EagerSingleton();

    private String name;

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance(String name) {
        instance.name = name;
        return instance;
    }

    public String getName() {
        return name;
    }
}
