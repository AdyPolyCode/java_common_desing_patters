package adapter;

import java.util.HashSet;
import java.util.List;

public class EuroPriceSummarizer {
    public static void summarizeProducts(List<Product> products) {
        double total = 0;
        HashSet<String> productTypes = new HashSet<>();

        for (Product p:
             products) {
            System.out.println("Adding price to total of product: " + p.getDescription());
            productTypes.add(p.getClass().getSimpleName());
            total += p.getPrice();
        }

        System.out.println("\nTotal price of products: " + productTypes + " is " + total + " EU.");
    }
}
