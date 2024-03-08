package adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        printWithoutAdaptor();
        System.out.println("\n");
        printWithAdaptor();
    }

    private static void printWithoutAdaptor() {
        GermanProduct product1 = new GermanProduct();
        HungarianProduct product4 = new HungarianProduct();
        GermanProduct product2 = new GermanProduct();
        HungarianProduct product3 = new HungarianProduct();
        List<Product> list = List.of(product3, product2, product4, product1);

        EuroPriceSummarizer.summarizeProducts(list);
    }

    private static void printWithAdaptor() {
        GermanProduct product1 = new GermanProduct();
        HungarianProduct product3 = new HungarianProduct();
        GermanProduct product2 = new GermanProduct();
        Adapter product4 = new Adapter(product3);
        List<Product> list = List.of(product2, product4, product4, product1);

        EuroPriceSummarizer.summarizeProducts(list);
    }
}