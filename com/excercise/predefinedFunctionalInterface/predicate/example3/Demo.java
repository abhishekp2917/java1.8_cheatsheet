/*
    Code to demonstrate static methods of Predicate interface
*/

package com.excercise.predefinedFunctionalInterface.predicate.example3;

import java.util.function.Predicate;

public class Demo {
    
    public static void main(String[] args) {
        
        // creating student obeject which will be used to compare other students
        Student student1 = new Student("Abhishek", 8);

        // using isEqual() method by passing 'student1' object which will return a Predicate to compare this passed student with 
        // other students
        Predicate<Student> isStudent1 = Predicate.isEqual(student1);

        // creating other students object to compare
        Student student2 = new Student("Abhishek", 8);
        Student student3 = new Student("Ravi", 8);
        Student student4 = new Student("Abhishek", 10);

        // comparing students
        System.out.println(isStudent1.test(student2));
        System.out.println(isStudent1.test(student3));
        System.out.println(isStudent1.test(student4));
    }
}

// student class which has name and marks attribute
class Student {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // overriding equals method as static method isEqual() will call equals() method to compare objects 
    @Override
    public boolean equals(Object object) {
        if(!(object instanceof Student)) return false;
        Student student = (Student) object;
        return (student.name.equals(this.name) && student.marks==this.marks);
    }
}
