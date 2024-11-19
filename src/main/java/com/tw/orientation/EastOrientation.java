package com.tw.orientation;

import com.tw.entity.Coordinate;
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

    @Override
    public Coordinate moveForward(Coordinate coordinate) {
        return new Coordinate(coordinate.getAbscissa() + 1, coordinate.getOrdinate());
    }
}
