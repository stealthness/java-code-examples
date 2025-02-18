package singletons.lazy;

/**
 * Lazy initialization of a singleton. The instance is created only when it is needed. However, this implementation is not
 * thread-safe. If two threads call getInstance() at the same time, two instances will be created.
 */
public class LazySingleton {

    private static LazySingleton instance;
    private final String name;

    private LazySingleton(String name) {
        this.name = name;
    }

    public static LazySingleton getInstance(String name) {
        if (instance == null) {
            instance = new LazySingleton(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}
