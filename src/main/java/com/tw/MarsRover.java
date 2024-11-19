package com.tw;

import com.tw.entity.Coordinate;
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
        if("L".equals(command)){
            return "0:0:W";
        }
        return null;
    }
}
