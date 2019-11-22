package com.dell.smarthome;

public class HomeShower implements Shower {

    boolean isTurnedOff = false;

    public HomeShower(boolean turnOff) {
        isTurnedOff = turnOff;
    }


    @Override
    public boolean isTurnedOff() {
        return isTurnedOff;
    }
}
