package com.dell.smarthome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmartHomeTest {

    private CoffeeMaker coffeeMaker;

    @BeforeEach
    public void setUp() {
        coffeeMaker = new CoffeeMakerObserver();
    }

    @Test
    public void whenClockIs8amThenCoffeeMakerTurnsOn() {
        Clock alarm = new DigitalClock(LocalTime.of(8, 0));
        Shower shower = new HomeShower(false);
        SmartHome smartHome = new SmartHome(alarm, coffeeMaker, shower);
        smartHome.run();

        assertTrue(coffeeMaker.isOn());
    }

    @Test
    public void whenClockIs9amThenCoffeeMakerTurnsOff() {
        Clock alarm = new DigitalClock(LocalTime.of(9, 0));
        Shower shower = new HomeShower(false);
        SmartHome smartHome = new SmartHome(alarm, coffeeMaker, shower);
        smartHome.run();

        assertFalse(coffeeMaker.isOn());
    }

    @Test
    public void whenClockIsNot8amAndShowerIsTurnedOffThenCoffeeMakerTurnsOn() {
        Clock alarm = new DigitalClock(LocalTime.of(9, 0));
        Shower shower = new HomeShower(true);
        SmartHome smartHome = new SmartHome(alarm, coffeeMaker, shower);
        smartHome.run();

        assertTrue(coffeeMaker.isOn());
    }

    @Test
    public void whenClockIsNot8amAndShowerIsNotTurnedOffThenCoffeeMakerNotTurnsOn() {
        Clock alarm = new DigitalClock(LocalTime.of(9, 0));
        Shower shower = new HomeShower(false);
        SmartHome smartHome = new SmartHome(alarm, coffeeMaker, shower);
        smartHome.run();

        assertFalse(coffeeMaker.isOn());
    }

}
