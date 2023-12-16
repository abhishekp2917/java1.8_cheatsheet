/*
    code to demonstrate how to not using lambda expression with Collections makes the code lengthy
*/

package com.excercise.javaLambda.lambdaWithFunctionalInterface.example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo1 {

    public static void main(String[] args) {
        
        // creating list of Student object
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Abhishek", 7.9f));
        students.add(new Student("Ravi", 7.1f));
        students.add(new Student("Saurabh", 8.9f));
        
        // creating object of type Comparator (functional interface)
        Comparator<Student> studentComparator = new StudentComparator();

        // we want to sort the list of students based on their marks 
        // to sort it, we have sort() method under Collections class which takes 2 argument viz list and an object of Comparator interface which is a functional interface
        Collections.sort(students, studentComparator);

        for(Student student : students) {
            System.out.println(String.format("Name : %s Marks : %f", student.name, student.marks));
        }
    }
}

// providing implementation for Comparator (functional interface) whose object will be used to sort the list of Student 
class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if(student1.marks<student2.marks) return -1;
        else return 1;
    }
}


