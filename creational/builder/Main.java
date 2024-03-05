package builder;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Builder builder1 = new RoomBuilder()
                .setDimensions(new Dimension())
                .setCeilingHeight(1)
                .setFloorNumber(1)
                .setNumberOfDoors(1)
                .setNumberOfWindows(2)
                .setWallColor(new Color(255, 255, 255));

        EnhancedRoomBuilder builder2 = new EnhancedRoomBuilder.Builder()
                .setDimensions(new Dimension())
                .setCeilingHeight(1)
                .setFloorNumber(1)
                .setNumberOfDoors(1)
                .setNumberOfWindows(2)
                .setWallColor(new Color(255, 255, 255))
                .build();
    }
}
