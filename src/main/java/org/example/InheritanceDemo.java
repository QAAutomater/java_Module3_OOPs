package org.example;

// Base class (Parent class)
class Animal {
    // Method of the parent class
    public void eat() {
        System.out.println("This animal eats food.");
    }

    public void sleep() {
        System.out.println("This animal sleeps.");
    }
}

// Derived class (Child class)
class Dog extends Animal {
    // Method specific to Dog
    public void bark() {
        System.out.println("The dog barks.");
    }

    // Overriding a method from the parent class
    @Override
    public void eat() {
        System.out.println("The dog eats bones.");
    }
}

// Another derived class
class Cat extends Animal {
    public void meow() {
        System.out.println("The cat meows.");
    }

    // Overriding a method from the parent class
    @Override
    public void eat() {
        System.out.println("The cat eats fish.");
    }
}

// Main class to run the program
public class InheritanceDemo {
    public static void main(String[] args) {
        // Creating a Dog object
        Dog myDog = new Dog();
        myDog.eat();     // Overridden method
        myDog.sleep();   // Inherited method
        myDog.bark();    // Dog-specific method

        System.out.println();  // Blank line for readability

        // Creating a Cat object
        Cat myCat = new Cat();
        myCat.eat();     // Overridden method
        myCat.sleep();   // Inherited method
        myCat.meow();    // Cat-specific method
    }
}
