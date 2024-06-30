package singleton.synchronizeV2;

// Implementation is Thread Safe
// Initialization block is synchronized
public class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private SingletonSynchronized() {
    }

    public static SingletonSynchronized getInstance() {
        if (instance == null) {
            synchronized (SingletonSynchronized.class) {
                instance = new SingletonSynchronized();
            }
        }
        return instance;
    }
}
