package Inheritance;

public class Vehicle {
    private String engine;
    private int wheels;
    private int seats;
    private int fuelTank;
    private String lights;

    public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTank = fuelTank;
        this.lights = lights;
    }

    public Vehicle() {
        this.engine = "Diesel";
        this.wheels = 4;
        this.seats = 5;
        this.fuelTank = 50;
        this.lights = "LED";

    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public String getLights() {
        return lights;
    }



}