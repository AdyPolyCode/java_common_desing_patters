package decorator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IPizza> list = new ArrayList<>() {
            {
                add(new SausagePizza());
                add(new PizzaWithExtraCheese(new SausagePizza()));
            }
        };

        System.out.println(list);
    }
}
