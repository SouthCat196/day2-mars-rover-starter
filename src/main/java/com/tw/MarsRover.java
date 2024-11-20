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

    public String executeCommand(String commands) {
        commands.chars()
                .mapToObj(c -> (char) c)
                .map(Command::fromChar) // 将字符映射到 Command 枚举
                .forEach(command -> command.execute(this));
        return showStatus();
    }

    private void moveBackward() {
        coordinate = orientation.moveBackward(coordinate);
    }

    private void moveForward() {
        coordinate = orientation.moveForward(coordinate);
    }

    private void turnLeft() {
        orientation = orientation.turnLeft();
    }

    private void turnRight() {
        orientation = orientation.turnRight();
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }
}
