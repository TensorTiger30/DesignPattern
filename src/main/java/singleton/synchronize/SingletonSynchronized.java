package singleton.synchronize;

// Implementation is Thread Safe
// Implementation also makes reading instance Synchronized -> that's not necessary
public class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private SingletonSynchronized() {
    }

    public static synchronized SingletonSynchronized getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronized();
        }
        return instance;
    }
}
