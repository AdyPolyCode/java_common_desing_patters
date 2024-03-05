package singleton;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            InMemoryDatabase.getInstance();
            System.out.println("T1 got access to " + InMemoryDatabase.class.getSimpleName());
        });
        Thread t2 = new Thread(() -> {
            InMemoryDatabase.getInstance();
            System.out.println("T2 got access to " + InMemoryDatabase.class.getSimpleName());
        });

        t1.start();
        t2.start();
    }
}
