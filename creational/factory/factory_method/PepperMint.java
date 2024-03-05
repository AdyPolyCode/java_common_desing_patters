package factory.factory_method;

import java.util.ArrayList;
import java.util.List;

public class PepperMint extends Candy {
    public PepperMint() {
        super(PepperMint.class.getSimpleName());
    }

    @Override
    public List<Candy> generateQuantity(int quantity) {
        List<Candy> candies = new ArrayList<>();
        for (;quantity > 0;quantity--) {
            candies.add(new PepperMint());
        }
        return candies;
    }

    @Override
    public String toString() {
        return "PepperMint{name: " + getName() + "}";
    }
}
