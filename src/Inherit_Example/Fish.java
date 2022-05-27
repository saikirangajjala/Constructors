package Inherit_Example;

public class Fish extends Animal{
    private boolean waterbone = true;
    private boolean fishGills = true;

    public Fish() {
        height= 3.5;
        weight=15;
        animalType = "Fish";
        this.waterbone = true;
        this.fishGills = true;
    }

    public boolean isWaterbone() {
        return waterbone;
    }

    public boolean isFishGills() {
        return fishGills;
    }
    @Override
    public String toString() {
        return "Fish{" +
                "waterbone=" + waterbone +
                ", fishGills=" + fishGills +
                '}';
    }
}
