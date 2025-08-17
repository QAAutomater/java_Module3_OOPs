package org.example;

// ---------- Abstract Class Example ----------

// Abstract class (cannot be instantiated)
abstract class Vehicle {
    // Abstract method (no body) — must be implemented by subclasses
    public abstract void startEngine();

    // Non-abstract method — common to all vehicles
    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

// Subclass of abstract class
class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}

// Another subclass
class Bike extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike engine started.");
    }
}

// ---------- Interface Example ----------

interface Flyable {
    void takeOff();  // abstract by default
    void land();
}

// Class implementing interface
class Airplane implements Flyable {
    @Override
    public void takeOff() {
        System.out.println("Airplane is taking off.");
    }

    @Override
    public void land() {
        System.out.println("Airplane has landed.");
    }
}

// Another class implementing interface
class Drone implements Flyable {
    @Override
    public void takeOff() {
        System.out.println("Drone is taking off.");
    }

    @Override
    public void land() {
        System.out.println("Drone has landed.");
    }
}

// ---------- Main Class ----------
public class AbstractionDemo {
    public static void main(String[] args) {
        // Abstract Class Demonstration
        Vehicle myCar = new Car();
        myCar.startEngine();
        myCar.stopEngine();

        Vehicle myBike = new Bike();
        myBike.startEngine();
        myBike.stopEngine();

        System.out.println(); // For readability

        // Interface Demonstration
        Flyable myPlane = new Airplane();
        myPlane.takeOff();
        myPlane.land();

        Flyable myDrone = new Drone();
        myDrone.takeOff();
        myDrone.land();
    }
}