package Polymorphism;

public class Phone {

    private String model;
    public String getModel() {
        return model;
    }


    public Phone(String model) {
        this.model = model;
    }

    public void feature() {
System.out.println("Simple phone");
    }

}
