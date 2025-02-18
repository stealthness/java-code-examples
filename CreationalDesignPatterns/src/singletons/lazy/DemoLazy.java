package singletons.lazy;

public class DemoLazy {

    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getInstance("First instance");
        LazySingleton instance2 = LazySingleton.getInstance("Second instance");

        System.out.println(instance1 == instance2); // true
        System.out.println(instance1.getName()); // First instance
        System.out.println(instance2.getName()); // First instance, not Second instance as there was already an instance created
    }
}
