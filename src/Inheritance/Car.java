package Inheritance;

public class Car extends Vehicle{


    private String musicSystem;
    private String steering;
    private String airConditiner;
    private String fridge;
    private String entertainmentSystem;


    public Car() {
        this.musicSystem = musicSystem;
        this.steering = steering;
        this.airConditiner = airConditiner;
        this.fridge = fridge;
        this.entertainmentSystem = entertainmentSystem;
        musicSystem="jbl";
        steering="wheel";
        airConditiner="Daikin";
        fridge="Whirlpool";
        entertainmentSystem="songs";

    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getSteering() {
        return steering;
    }

    public String getAirConditiner() {
        return airConditiner;
    }

    public String getFridge() {
        return fridge;
    }

    public String getEntertainmentSystem() {
        return entertainmentSystem;
    }

}
