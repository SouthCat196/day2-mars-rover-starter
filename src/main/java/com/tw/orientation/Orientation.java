package com.tw.orientation;

import com.tw.entity.Coordinate;
import com.tw.marsRoverEnum.Direction;

public interface Orientation {

    Direction getDirection();

    Orientation turnLeft();

    Orientation turnRight();

    Coordinate moveForward(Coordinate coordinate);
}
