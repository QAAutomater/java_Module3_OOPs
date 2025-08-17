package org.example;

// Final class cannot be extended
final class University {
    public void showUniversityName() {
        System.out.println("OpenAI University");
    }
}

// Regular class
class Student {
    // Final variable (constant)
    final int maxCourses = 5;

    // Final method - cannot be overridden
    public final void displayInfo() {
        System.out.println("Student info displayed.");
    }

    // Method using final variable
    public void registerCourses(int courseCount) {
        if (courseCount > maxCourses) {
            System.out.println("Cannot register more than " + maxCourses + " courses.");
        } else {
            System.out.println("Registered for " + courseCount + " courses.");
        }
    }
}

// Attempt to extend final class (this will cause a compile-time error if uncommented)
// class SubUniversity extends University {}  // ❌ ERROR

// Subclass trying to override a final method (also invalid if uncommented)
class GraduateStudent extends Student {
    // ❌ ERROR: Cannot override final method
    // public void displayInfo() {
    //     System.out.println("Graduate Student info displayed.");
    // }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        // Final variable usage
        Student student = new Student();
        student.displayInfo();
        student.registerCourses(3);
        student.registerCourses(6); // Exceeds maxCourses

        System.out.println(); // For spacing

        // Final class usage
        University uni = new University();
        uni.showUniversityName();
    }
}