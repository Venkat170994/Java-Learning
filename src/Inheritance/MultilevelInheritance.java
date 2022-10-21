package Inheritance;

class Animal {
    void eat() {
        System.out.println("Animal is Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class BabyDog extends Dog {
    void run() {
        System.out.println("BabyDog is running");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        BabyDog bg = new BabyDog();
        bg.run();
        bg.bark();
        bg.eat();

    }
}