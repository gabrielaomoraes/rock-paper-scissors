package com.dell.smarthome;

public class SmartHome {

    private final Shower shower;
    private CoffeeMaker coffeeMaker;
    private Clock alarm;

    public SmartHome(Clock alarm, CoffeeMaker coffeeMaker, Shower shower) {
        this.alarm = alarm;
        this.coffeeMaker = coffeeMaker;
        this.shower = shower;
    }

    public void run() {
        if (alarm.isRinging()) {
            coffeeMaker.turnOn();
        }
        if (shower.isTurnedOff()){
            coffeeMaker.turnOn();
        }
    }
}
