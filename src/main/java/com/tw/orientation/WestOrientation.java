package com.tw.orientation;

import com.tw.entity.Coordinate;
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

    @Override
    public Coordinate moveForward(Coordinate coordinate) {
        return new Coordinate(coordinate.getAbscissa() - 1, coordinate.getOrdinate());
    }

    @Override
    public Coordinate moveBackward(Coordinate coordinate) {
        return new Coordinate(coordinate.getAbscissa() + 1, coordinate.getOrdinate());
    }
}
