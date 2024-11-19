package com.tw;

import com.tw.entity.Coordinate;
import com.tw.marsRoverEnum.Command;
import com.tw.orientation.NorthOrientation;
import com.tw.orientation.Orientation;

public class MarsRover {

    private Coordinate coordinate;

    private Orientation orientation;

    public MarsRover() {
        coordinate = new Coordinate(0, 0);
        orientation = new NorthOrientation();
    }

    public String showStatus() {
        return String.format("%s:%s:%s", coordinate.getAbscissa(), coordinate.getOrdinate(), orientation.getDirection());
    }

    public String executeCommand(String command) {
        if (Command.L.getCommand().equals(command)) {
            turnLeft();
        }
        if (Command.R.getCommand().equals(command)) {
            turnRight();
        }

        return showStatus();
    }

    private void turnLeft() {
        orientation = orientation.turnLeft();
    }

    private void turnRight() {
        orientation = orientation.turnRight();
    }


}
