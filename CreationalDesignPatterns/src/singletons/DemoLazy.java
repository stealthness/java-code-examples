package singletons;

import singletons.eager.EagerSingleton;
import singletons.lazy.LazySingleton;
import singletons.threadsafe.ThreadSafeSingleton;

public class DemoLazy {

    public static void main(String[] args) {
        //lazy();
        //lazyThread();
        //eager();
        threadSafeThread();
    }

    private static void eager() {
        System.out.println("Eager Singleton");
        for (int i = 0; i < 10; i++) {
            final int finalI = i;
            new Thread(() -> {
                EagerSingleton instance = EagerSingleton.getInstance("Thread instance " + finalI);
                System.out.println(instance.getName());
            }).start();
        }
        EagerSingleton instance1 = EagerSingleton.getInstance("First instance");
    }

    /**
     * This method demonstrates that only a single instance of the lazy singleton is created.
     */
    private static void lazy() {
        LazySingleton instance1 = LazySingleton.getInstance("First instance");
        LazySingleton instance2 = LazySingleton.getInstance("Second instance");

        System.out.println(instance1 == instance2); // true
        System.out.println(instance1.getName()); // First instance
        System.out.println(instance2.getName()); // First instance, not Second instance as there was already an instance created

    }

    /**
     * This method demonstrates that the lazy singleton is not thread-safe. If two threads call getInstance() at the same time,
     */
    private static void lazyThread() {
        System.out.println("Lazy Singleton");
        for (int i = 0; i < 10; i++) {
            final int finalI = i;
            new Thread(() -> {
                LazySingleton instance = LazySingleton.getInstance("Thread instance " + finalI);
                System.out.println(instance.getName());
            }).start();
        }
    }

    /**
     * This method demonstrates that the thread-safe singleton is thread-safe. If two threads call getInstance() at the same time,
     * only one instance is created.
     */
    private static void threadSafeThread() {
        System.out.println("Lazy Singleton");
        for (int i = 0; i < 10; i++) {
            final int finalI = i;
            new Thread(() -> {
                ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance("Thread instance " + finalI);
                System.out.println(instance.getName());
            }).start();
        }
    }
}
