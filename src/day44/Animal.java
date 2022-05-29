package day44;

import java.util.Set;

public abstract class Animal {
    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private double size;
    private final String color;

    public Animal(String name, String breed, char gender, int age, double size, String color) {
        setName(name);
        this.breed = breed;
        if (!((gender=='F')||(gender=='M'))){
            throw new RuntimeException("Invalid entry");
            //
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public abstract void eat();
    public void drink() {
        System.out.println(getName() + " is drinking water");

    }


    public String toString() {
        return getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
