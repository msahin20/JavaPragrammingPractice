package day44;

public class Dog extends Animal{
    public Dog(String name, String breed, char gender, int age, double size, String color) {
        super(name, breed, gender, age, size, color);
    }


    public void eat() {
        System.out.println(getName() + " is eating Pizza");
    }


}
