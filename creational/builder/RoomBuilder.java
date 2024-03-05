package builder;

import java.awt.*;

public class RoomBuilder implements Builder {
    private int ceilingHeight;
    private Dimension dimensions;
    private int floorNumber;
    private int numberOfDoors;
    private int numberOfWindows;
    private Color wallColor;

    @Override
    public Builder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    @Override
    public Builder setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    @Override
    public Builder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    @Override
    public Builder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    @Override
    public Builder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    @Override
    public Builder setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public Room createRoom() {
        return new Room(ceilingHeight, dimensions, floorNumber, numberOfDoors, numberOfWindows, wallColor);
    }
}
