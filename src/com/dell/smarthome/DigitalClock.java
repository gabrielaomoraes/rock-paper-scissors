package com.dell.smarthome;

import java.time.LocalTime;

public class DigitalClock implements Clock {

    boolean ringing = false;

    public DigitalClock(LocalTime of) {
        if (of.getHour() == 8 && of.getMinute() == 00) {
            ringing = true;
        }
    }

    @Override
    public boolean isRinging() {

        return ringing;
    }
}
