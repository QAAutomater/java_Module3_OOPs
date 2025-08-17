package org.example;

// Demonstrating Compile-Time Polymorphism (Method Overloading)
class Calculator {

    // Overloaded method with 2 integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with 3 integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with 2 doubles
    public double add(double a, double b) {
        return a + b;
    }
}

// Demonstrating Run-Time Polymorphism (Method Overriding)

// Base class
class Animals {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class
class Dogs extends Animals {
    // Overriding makeSound() of Animal
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Another derived class
class Cats extends Animals {
    // Overriding makeSound() of Animal
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class to run the examples
public class PolymorphismDemo {
    public static void main(String[] args) {

        // ---------- Method Overloading ----------
        Calculator calc = new Calculator();

        System.out.println("Add 2 ints: " + calc.add(5, 10));
        System.out.println("Add 3 ints: " + calc.add(5, 10, 15));
        System.out.println("Add 2 doubles: " + calc.add(5.5, 4.5));

        System.out.println(); // For readability

        // ---------- Method Overriding (Polymorphism) ----------
        Animals myAnimal;

        myAnimal = new Dogs();  // Reference of Animal, object of Dog
        myAnimal.makeSound();  // Calls Dog's overridden method

        myAnimal = new Cats();  // Reference of Animal, object of Cat
        myAnimal.makeSound();  // Calls Cat's overridden method
    }
}

