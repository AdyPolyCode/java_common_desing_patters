package adapter;

public class Adapter implements Product {
    private HungarianProduct hungarianProduct;

    public Adapter(HungarianProduct hungarianProduct) {
        this.hungarianProduct = hungarianProduct;
    }

    @Override
    public double getPrice() {
        return hungarianProduct.getPrice() * 0.0025D;
    }

    @Override
    public String getDescription() {
        return hungarianProduct.getDescription();
    }
}
