package adapter;

public class HungarianProduct implements Product {
    @Override
    public double getPrice() {
        return 14_223.23;
    }

    @Override
    public String getDescription() {
        return "Simple but powerful Hungarian Product.";
    }
}
