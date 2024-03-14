package composite;

public class Manager implements IPay {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println(this.getClass().getSimpleName() + ": I " + this.name + " have been paid " + amount);
    }
}
