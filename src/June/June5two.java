package June;

import java.util.Scanner;

class Animal2 {
    private final String name;

    public Animal2(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("The animal's name is " + name);
    }

    void speak() {
        System.out.println(getName() + " makes a sound.");
    }

    public String getName() {
        return name;
    }
}

class Dog2 extends Animal2 {
    public Dog2(String name) {
        super(name);
    }
}

class Lion extends Animal2 {
    public Lion(String name) {
        super(name);
    }

    @Override
    void speak(){
        System.out.println(getName() + " roars!");
    }
}

class Elephant extends Animal2 {
    public Elephant(String name) {
        super(name);
    }

    @Override
    void speak(){
        System.out.println(getName() + " trumpets!");
    }
}

public class June5two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dog = scanner.next();
        String lion = scanner.next();
        String elephant = scanner.next();

        Animal2 animal1 = new Dog2(dog);
        Animal2 animal2 = new Lion(lion);
        Animal2 animal3 = new Elephant(elephant);

        animal1.showName();
        animal1.speak();
        animal2.showName();
        animal2.speak();
        animal3.showName();
        animal3.speak();
    }
}
