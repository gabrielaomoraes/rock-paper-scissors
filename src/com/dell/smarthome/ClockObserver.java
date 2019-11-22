package com.dell.smarthome;

import java.time.LocalTime;

public class ClockObserver implements Clock {

    private final LocalTime time;

    public ClockObserver(LocalTime time) {
        this.time = time;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
