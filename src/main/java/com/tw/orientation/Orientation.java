package com.tw.orientation;

import com.tw.marsRoverEnum.Direction;

public interface Orientation {

    Direction getDirection();

    Orientation turnLeft();

    Orientation turnRight();
}
