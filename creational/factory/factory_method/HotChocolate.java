package factory.factory_method;

import java.util.ArrayList;
import java.util.List;

public class HotChocolate extends Candy {
    public HotChocolate() {
        super(HotChocolate.class.getSimpleName());
    }

    @Override
    public List<Candy> generateQuantity(int quantity) {
        List<Candy> candies = new ArrayList<>();
        for (;quantity > 0;quantity--) {
            candies.add(new HotChocolate());
        }
        return candies;
    }

    @Override
    public String toString() {
        return "HotChocolate{name: " + getName() + "}";
    }
}
