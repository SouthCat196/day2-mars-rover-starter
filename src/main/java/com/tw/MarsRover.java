package com.tw;

public class MarsRover {

    private int abscissa;
    private int ordinate;
    private String direction;

    public MarsRover() {
        abscissa = 0;
        ordinate = 0;
        direction = "N";
    }

    public String showStatus() {
        return String.format("%s:%s:%s", abscissa, ordinate, direction);
    }
}