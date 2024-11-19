package com.tw.orientation;

import com.tw.marsRoverEnum.Direction;

public class WestOrientation implements Orientation {
    @Override
    public Direction getDirection() {
        return Direction.W;
    }

    @Override
    public Orientation turnLeft() {
        return new SouthOrientation();
    }

    @Override
    public Orientation turnRight() {
        return new NorthOrientation();
    }
}
