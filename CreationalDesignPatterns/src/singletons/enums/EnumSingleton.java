package singletons.enums;

/**
 * EnumSingleton is a singleton implemented using an enum. This is the best way to implement a singleton because it is
 * thread-safe and it is guaranteed that only one instance of the singleton is created.
 * However, this implementation is not lazy. The instance is created when the enum is loaded and the enum class is not very
 * extensible.
 */
public enum EnumSingleton {

    INSTANCE;

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

    // other methods
    public void doSomething() {
        System.out.println("Doing something...");
    }


}
