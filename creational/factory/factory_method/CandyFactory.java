package factory.factory_method;

import java.util.List;

public class CandyFactory {
    public enum CANDY_TYPE {
        HOT_CHOCOLATE,
        LOLLIPOP,
        PEPPERMINT
    }

    public static Candy getCandy(CANDY_TYPE type) {
        switch (type) {
            case HOT_CHOCOLATE: return new HotChocolate();
            case LOLLIPOP: return new Lollipop();
            case PEPPERMINT: return new PepperMint();
            default: return null;
        }
    }

    public static List<Candy> generateQuantityOf(int quantity, CANDY_TYPE type) {
        Candy candy = getCandy(type);
        List<Candy> candies = candy.generateQuantity(quantity);
        return candies;
    }
}
