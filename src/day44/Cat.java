package day44;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, int age, double size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating Biryani");

    }
}

class Zoo {

    public static void main(String[] args) {

        Cat cat = new Cat ("miyos", "van kedisi", 'F', 10,10.5, "yellow" );

        System.out.println(cat);
    }
}