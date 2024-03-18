package facade;

import java.util.Arrays;
import java.util.List;

public class MotherBoard {
    List<IComponent> components;

    public MotherBoard(IComponent... components) {
        this.components = Arrays.stream(components).toList();
    }

    public void startPowerOnSelfTest() {
        System.out.println("Checking concrete components");
    }

    public void run() {
        components.forEach(c -> c.run());
    }
}
