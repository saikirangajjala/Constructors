package Inherit_Example;

public class Crocodile extends Reptile{

  public Crocodile(){
super();
      eggs = "hardShelled";
  }

    @Override
    public String toString() {
        return "Crocodile{" +
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
