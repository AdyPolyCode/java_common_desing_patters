package decorator;

import java.util.List;

public interface IPizza {
    List<String> getToppings();
    void addTopping(String value);
    String getName();
}
