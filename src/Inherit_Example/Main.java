package Inherit_Example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        Reptile reptile= new Reptile();
        Fish fish = new Fish();
        Animal animal = new Animal();
Birds birds = new Birds();
        Crocodile croc = new Crocodile();
        System.out.println(fish.toString());
        System.out.println(reptile.showInfo());
        System.out.println(animal.toString());
    System.out.println(croc.toString());
    System.out.println(birds.toString());


    }
}
