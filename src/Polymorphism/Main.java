package Polymorphism;


public class Main {
    public static void main(String[] args){
Phone iphone = new Iphone("Iphone");
System.out.println(iphone.getModel());
iphone.feature();
    Phone samsung = new Samsung("Note 8");
    System.out.println(samsung.getModel());
    samsung.feature();
    }
}
