package singleton;

public class InMemoryDatabase {
    private static final InMemoryDatabase instance = new InMemoryDatabase();
    private static boolean initialized = false;

    public void init() {
        // logic here
    }

    public static synchronized InMemoryDatabase getInstance() {
        if(initialized) return InMemoryDatabase.instance;
        InMemoryDatabase.instance.init();
        InMemoryDatabase.initialized = true;
        return InMemoryDatabase.instance;
    }
}
