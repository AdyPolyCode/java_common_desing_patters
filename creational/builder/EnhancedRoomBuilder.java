package builder;

import java.awt.*;

public class EnhancedRoomBuilder {
    private int ceilingHeight;
    private Dimension dimensions;
    private int floorNumber;
    private int numberOfDoors;
    private int numberOfWindows;
    private Color wallColor;

    public EnhancedRoomBuilder(EnhancedRoomBuilder.Builder builder) {
        this.ceilingHeight = builder.ceilingHeight;
        this.dimensions = builder.dimensions;
        this.floorNumber = builder.floorNumber;
        this.numberOfDoors = builder.numberOfDoors;
        this.numberOfWindows = builder.numberOfWindows;
        this.wallColor = builder.wallColor;
    }

    public static class Builder {
        private int ceilingHeight;
        private Dimension dimensions;
        private int floorNumber;
        private int numberOfDoors;
        private int numberOfWindows;
        private Color wallColor;

        public Builder setCeilingHeight(int ceilingHeight) {
            this.ceilingHeight = ceilingHeight;
            return this;
        }

        public Builder setDimensions(Dimension dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setFloorNumber(int floorNumber) {
            this.floorNumber = floorNumber;
            return this;
        }

        public Builder setNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        public Builder setNumberOfWindows(int numberOfWindows) {
            this.numberOfWindows = numberOfWindows;
            return this;
        }

        public Builder setWallColor(Color wallColor) {
            this.wallColor = wallColor;
            return this;
        }

        public EnhancedRoomBuilder build() {
            return new EnhancedRoomBuilder(this);
        }
    }
}
