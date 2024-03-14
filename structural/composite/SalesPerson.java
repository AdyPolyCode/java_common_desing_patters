package composite;

public class SalesPerson implements IPay {
    private String name;

    private Manager manager;

    public SalesPerson(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println(this.getClass().getSimpleName() + ": I " + this.name + " have been paid " + amount);
    }
}
