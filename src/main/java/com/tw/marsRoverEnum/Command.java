package com.tw.marsRoverEnum;

public enum Command {
    M("M"),
    L("L"),
    R("R"),
    B("B");

    private final String command;

    Command(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

}
