package com.tw.orientation;

import com.tw.marsRoverEnum.Direction;

public class EastOrientation implements Orientation {
    @Override
    public Direction getDirection() {
        return Direction.E;
    }

    @Override
    public Orientation turnLeft() {
        return new NorthOrientation();
    }

    @Override
    public Orientation turnRight() {
        return new SouthOrientation();
    }
}
