package com.tw.orientation;

import com.tw.marsRoverEnum.Direction;

public class SouthOrientation implements Orientation {
    @Override
    public Direction getDirection() {
        return Direction.S;
    }

    @Override
    public Orientation turnLeft() {
        return new EastOrientation();
    }

    @Override
    public Orientation turnRight() {
        return new WestOrientation();
    }
}
