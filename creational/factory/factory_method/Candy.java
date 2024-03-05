package factory.factory_method;

import java.util.List;

public abstract class Candy {
    private String name;

    protected Candy(String name) {
        this.name = name;
    }

    public abstract List<Candy> generateQuantity(int quantity);

    public String getName() {
        return name;
    }
}
