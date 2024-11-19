package com.tw.orientation;

import com.tw.entity.Coordinate;
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

    @Override
    public Coordinate moveForward(Coordinate coordinate) {
        return new Coordinate(coordinate.getAbscissa(), coordinate.getOrdinate() - 1);
    }

    @Override
    public Coordinate moveBackward(Coordinate coordinate) {
        return new Coordinate(coordinate.getAbscissa(), coordinate.getOrdinate() + 1);
    }
}
