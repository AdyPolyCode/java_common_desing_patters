package bridge;

import java.awt.*;

public class PinkColorShape implements ColorShape {
    @Override
    public void setColor(Graphics color) {
        color.setColor(Color.PINK);
    }
}
