package com.dell.smarthome;

public class CoffeeMakerObserver implements CoffeeMaker {

    boolean on = false;
    boolean turnOnMethodCalled = false;

    @Override
    public void turnOn() {
        on = true;
        turnOnMethodCalled = true;
    }

    @Override
    public void turnOff() {
        on = false;
        turnOnMethodCalled = false;
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
