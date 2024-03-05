package factory.factory_method;

import java.util.ArrayList;
import java.util.List;

public class Lollipop extends Candy {
    public Lollipop() {
        super(Lollipop.class.getSimpleName());
    }

    @Override
    public List<Candy> generateQuantity(int quantity) {
        List<Candy> candies = new ArrayList<>();
        for (;quantity > 0;quantity--) {
            candies.add(new Lollipop());
        }
        return candies;
    }

    @Override
    public String toString() {
        return "Lollipop{name: " + getName() + "}";
    }
}
