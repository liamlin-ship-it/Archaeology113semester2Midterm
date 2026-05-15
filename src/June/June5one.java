package June;

import java.util.Scanner;

class Animal {
    String name;
    String noise;

    public Animal(String name, String noise){
        this.name = name;
        this.noise = noise;
    }

    void speak() {
        System.out.println(name + " says: " + noise);
    }

    void showName() {
        System.out.println("The animal's name is " + name);
    }
}

class Dog extends Animal {
    public Dog(String dog, String noise) {
        super(dog, noise);
    }
}

class Cat extends Animal {
    public Cat(String cat, String noise) {
        super(cat, noise);
    }
}

class Bird extends Animal {
    public Bird(String bird, String noise) {
        super(bird, noise);
    }
}

public class June5one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dog = scanner.next();
        String cat = scanner.next();
        String bird = scanner.next();

        Animal animal1 = new Dog(dog, "Woof!");
        Animal animal2 = new Cat(cat, "Meow!");
        Animal animal3 = new Bird(bird, "Tweet!");

        animal1.showName();
        animal1.speak();
        animal2.showName();
        animal2.speak();
        animal3.showName();
        animal3.speak();

        scanner.close();
    }
}
