package singletons.doublechecked;

public class DoubleCheckedSingleton {

    // The volatile keyword is used to prevent the JVM from reordering the code. This is important because the instance
    // variable is declared as volatile.
    private static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {
    }

    // double-checked locking  to prevent two threads from calling getInstance() at the same time, which would result in
    // two instances being created
    public static DoubleCheckedSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }


}
