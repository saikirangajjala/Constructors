package Inherit_Example;

public class Reptile extends Animal{
    protected String skin;
    protected boolean backBone;
    protected String eggs;


    public Reptile() {
        height = 5.0;
        weight= 50;
        animalType="fish";
        this.skin = "Dry Skin";
        this.backBone = true;
        this.eggs = "soft";
    }

    public String showInfo() {
        return "Reptile{" +
                "height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", skin='" + skin + '\'' +
                ", backBone=" + backBone +
                ", eggs='" + eggs + '\'' +
                '}';
    }
}
