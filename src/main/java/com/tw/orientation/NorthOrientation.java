package com.tw.orientation;

import com.tw.marsRoverEnum.Direction;

public class NorthOrientation implements Orientation {
    @Override
    public Direction getDirection() {
        return Direction.N;
    }

    @Override
    public Orientation turnLeft() {
        return new WestOrientation();
    }

    @Override
    public Orientation turnRight() {
        return new EastOrientation();
    }
}
