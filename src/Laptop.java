public class Laptop {
    private String Brand;
    private String Keyboard;
    private String Mouse;
    private String Speakers;

    public Laptop(String Brand, String Keyboard, String Mouse, String Speakers) {
        this.Brand = Brand;
        this.Keyboard = Keyboard;
        this.Mouse = Mouse;
        this.Speakers = Speakers;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getKeyboard() {
        return Keyboard;
    }

    public void setKeyboard(String keyboard) {
        Keyboard = keyboard;
    }

    public String getMouse() {
        return Mouse;
    }

    public void setMouse(String mouse) {
        Mouse = mouse;
    }

    public String getSpeakers() {
        return Speakers;
    }

    public void setSpeakers(String speakers) {
        Speakers = speakers;
    }

public char lap() {
if (Brand.equals("Hp")&&Keyboard.equals("hp")&&Mouse.equals("Dell")&&Speakers.equals("JBL")){
    System.out.println("My Laptop");
}else{
    System.out.println("Not my Laptop");
}

    return 0;
}

}
