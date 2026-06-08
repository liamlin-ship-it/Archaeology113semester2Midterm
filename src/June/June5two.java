package June;

import java.util.Scanner;

class Animal3 {
    private final String name; // 請勿修改此行

    public Animal3(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("The animal's name is " + name);
    }

    void speak() {
        System.out.println(name + " makes a sound.");
    }

    public String getName() {
        return name;
    }
}

class Lion3 extends Animal3 {
    public Lion3(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println(getName() + " roars!");
    }
}

class Elephant3 extends Animal3 {
    public Elephant3(String name) {
        super(name);
    }

    void speak() {
        System.out.println(getName() + " trumpets!");
    }
}

public class June5two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dog = scanner.next();
        String lion = scanner.next();
        String elephant = scanner.next();

        Animal3 animal1 = new Animal3(dog);
        Animal3 animal2 = new Lion3(lion);
        Animal3 animal3 = new Elephant3(elephant);

        animal1.showName();
        animal1.speak();
        animal2.showName();
        animal2.speak();
        animal3.showName();
        animal3.speak();
    }
}
