package Polymorphism;

public class Iphone extends Phone{
    public String model;

    public Iphone(String model) {
        super(model);
    }
    public void feature(){
        System.out.println("Apple");
    }
    public String getModel() {
        return model;
    }
}
