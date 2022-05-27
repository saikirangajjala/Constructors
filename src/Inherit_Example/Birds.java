package Inherit_Example;

public class Birds extends Animal{

    public boolean feathers = true;
    public boolean fly = true;{

    }

    @Override
    public String toString() {
        return "Birds{" +
                "feathers=" + feathers +
                ", fly=" + fly +
                '}';
    }
}
