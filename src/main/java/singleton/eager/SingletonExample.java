package singleton.eager;

public class SingletonExample {
    public static void main(String[] args) {
        SingletonEager instance = SingletonEager.getInstance();

        System.out.println(instance);

        SingletonEager instance2 = SingletonEager.getInstance();

        System.out.println(instance2);
    }
}
