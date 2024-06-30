package singleton.lazy;

public class SingletonExample {
    public static void main(String[] args) {
        SingletonLazy instance = SingletonLazy.getInstance();

        System.out.println(instance);

        SingletonLazy instance2 = SingletonLazy.getInstance();

        System.out.println(instance2);
    }
}
