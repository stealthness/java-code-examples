package singletons.threadsafe;

/**
 * Thread-safe initialization of a singleton. The instance is created only when it is needed. This implementation is
 * thread-safe, but it is not efficient. The synchronized keyword is used to prevent two threads from calling getInstance()
 * However, this implementation is not efficient because the synchronized keyword is used to prevent two threads from calling getInstance()
 * at the same time. This means that only one thread can call getInstance() at a time, while the other threads are blocked.
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    private final String name;

    // private constructor to prevent instantiation
    private ThreadSafeSingleton(String name) {
        this.name = name;
    }

    // synchronized keyword is used to prevent two threads from calling getInstance()
    public static synchronized ThreadSafeSingleton getInstance(String name) {
        if (instance == null) {
            {
                instance = new ThreadSafeSingleton(name);
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}
