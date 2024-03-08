package adapter;

public class GermanProduct implements Product {
    @Override
    public double getPrice() {
        return 299.99;
    }

    @Override
    public String getDescription() {
        return "All in one Product.";
    }
}
