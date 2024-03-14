package bridge;

import java.awt.*;

public class BlackColorShape implements ColorShape {
    @Override
    public void setColor(Graphics color) {
        color.setColor(Color.BLACK);
    }
}
