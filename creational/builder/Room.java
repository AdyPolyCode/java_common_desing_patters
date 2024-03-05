package builder;

import java.awt.*;

public class Room {
    private int ceilingHeight;
    private Dimension dimensions;
    private int floorNumber;
    private int numberOfDoors;
    private int numberOfWindows;
    private Color wallColor;

    public Room(int ceilingHeight, Dimension dimensions, int floorNumber, int numberOfDoors, int numberOfWindows, Color wallColor) {
        this.ceilingHeight = ceilingHeight;
        this.dimensions = dimensions;
        this.floorNumber = floorNumber;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.wallColor = wallColor;
    }
}
