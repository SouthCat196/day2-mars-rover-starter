package com.tw.command;

import com.tw.MarsRover;

public interface CommandStrategy {
    void execute(MarsRover context);
}
