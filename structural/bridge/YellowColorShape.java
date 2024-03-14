package bridge;

import java.awt.*;

public class YellowColorShape implements ColorShape {
    @Override
    public void setColor(Graphics color) {
        color.setColor(Color.GREEN);
    }
}
