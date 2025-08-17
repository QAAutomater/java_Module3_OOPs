package org.example;

// Parent class
class Person1 {
    String role = "University Staff";

    // Constructor
    public Person1() {
        System.out.println("Person constructor called");
    }

    // Method in parent class
    public void introduce() {
        System.out.println("I am a person working at the university.");
    }
}

// Child class
class Professor extends Person1 {
    String role = "Professor";  // Hides 'role' from parent class

    // Constructor
    public Professor() {
        // Call parent constructor
        super();
        System.out.println("Professor constructor called");
    }

    // Override method
    @Override
    public void introduce() {
        // Call parent method
        super.introduce();
        System.out.println("I teach Computer Science.");
    }

    // Method to show variable hiding
    public void showRoles() {
        System.out.println("Child class role: " + role);         // Professor
        System.out.println("Parent class role: " + super.role);  // University Staff
    }
}

// Main class
public class SuperKeywordDemo {
    public static void main(String[] args) {
        // Create object
        Professor prof = new Professor();

        // Method overriding with super call
        prof.introduce();

        System.out.println();  // For readability

        // Variable hiding demonstration
        prof.showRoles();
    }
}