package com.tw.orientation;

import com.tw.entity.Coordinate;
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

    @Override
    public Coordinate moveForward(Coordinate coordinate) {
        return new Coordinate(coordinate.getAbscissa(), coordinate.getOrdinate() + 1);
    }

    @Override
    public Coordinate moveBackward(Coordinate coordinate) {
        return new Coordinate(coordinate.getAbscissa(), coordinate.getOrdinate() - 1);
    }
}
