package Inherit_Example;

public class Animal {
    protected double height;
    protected double weight;
protected String animalType, bloodType;

    public Animal(){
        this.height = 5.2;
        this.weight = 90;
        this.animalType= "unknown";
        this.bloodType="unknown";
    }

    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}

