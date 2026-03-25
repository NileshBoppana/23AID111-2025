package controllers;

import devices.Device;

class Light implements Device {
    public void turnOn() {
        System.out.println("Light turned ON");
    }
    public void turnOff() {
        System.out.println("Light turned OFF");
    }
    public void status() {
        System.out.println("Light is operational");
    }
}

class Fan implements Device {
    public void turnOn() {
        System.out.println("Fan turned ON");
    }
    public void turnOff() {
        System.out.println("Fan turned OFF");
    }
    public void status() {
        System.out.println("Fan is operational");
    }
}

public class Controller {
    public void controlDevices() {
        Device light = new Light();
        Device fan = new Fan();

        light.turnOn();
        light.status();
        light.turnOff();

        fan.turnOn();
        fan.status();
        fan.turnOff();
    }
}