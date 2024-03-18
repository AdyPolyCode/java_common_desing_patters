package decorator;

import java.util.List;

public class PizzaWithExtraCheese implements IPizza {
    private IPizza pizza;

    public PizzaWithExtraCheese(IPizza pizza) {
        this.pizza = pizza;
        addTopping("CheeseCheese");
    }

    @Override
    public List<String> getToppings() {
        return pizza.getToppings();
    }

    @Override
    public void addTopping(String value) {
        this.pizza.addTopping(value);
    }

    @Override
    public String getName() {
        return pizza.getName();
    }

    @Override
    public String toString() {
        return this.pizza.toString();
    }
}
