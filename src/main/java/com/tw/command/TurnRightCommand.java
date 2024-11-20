package com.tw.command;

import com.tw.MarsRover;

public class TurnRightCommand implements CommandStrategy {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.setOrientation(marsRover.getOrientation().turnRight());
    }
}
