package singletons.billpugh;

public class BillPughSingleton {

    // The constructor is private so that it cannot be instantiated from outside the class.
    private BillPughSingleton() {
    }

    // The inner static class is not loaded until it is referenced. This is a lazy initialization of the singleton.
    // by being a static inner class only one instance of the inner class is created, which means only one instance of the
    // singleton is created.
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // The getInstance() method returns the instance of the singleton.
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
