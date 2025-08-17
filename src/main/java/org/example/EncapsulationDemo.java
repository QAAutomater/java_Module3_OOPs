package org.example;

// Class demonstrating Encapsulation
class Person {
    // Private fields (data hiding)
    private String name;
    private int age;

    // Constructor to initialize Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter for 'name'
    public String getName() {
        return name;
    }

    // Public setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for 'age'
    public int getAge() {
        return age;
    }

    // Public setter for 'age' with validation
    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Must be between 1 and 119.");
        }
    }
}

// Main class to use the encapsulated Person class
public class EncapsulationDemo {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("Alice", 25);

        // Accessing data via getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying data via setters
        person.setName("Bob");
        person.setAge(30);  // Valid update

        // Trying to set invalid age
        person.setAge(-10); // Invalid

        // Display updated values
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}
