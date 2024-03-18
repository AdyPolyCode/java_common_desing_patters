package decorator;

import java.util.ArrayList;
import java.util.List;

public class SausagePizza implements IPizza {
    private List<String> toppings;
    private String name;

    public SausagePizza() {
        this.toppings = new ArrayList<>() {
            {
                add("RedSausage");
                add("Salami");
                add("Corn");
                add("Ketchup");
            }
        };
        this.name = "Sausage";
    }

    public SausagePizza(List<String> toppings) {
        this();
        this.toppings = toppings;
    }


    @Override
    public List<String> getToppings() {
        return this.toppings;
    }

    @Override
    public void addTopping(String value) {
        this.toppings.add(value);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "SausagePizza{" +
                "toppings=" + toppings +
                ", name='" + name + '\'' +
                '}';
    }
}
