package Encapsulation;

public class Human {
    public static Human sai;
    private String name;
private int age;
private String sex;

    public Human() {
        this.name ="Sai";
        this.age = 24;
        this.sex = "Male";
    }

    public Human(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
