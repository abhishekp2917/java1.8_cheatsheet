/*
    code to demonstrate how to use lambda expression with Collections
*/

package com.excercise.lambda.lambdaWithFunctionalInterface.example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo2 {

    public static void main(String[] args) {
        
        // creating list of Student object
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Abhishek", 7.9f));
        students.add(new Student("Ravi", 7.1f));
        students.add(new Student("Saurabh", 8.9f));

        // storing lambda expression in variable of type Comparator (functional interface)
        // this lambda expression provides implementation of Comparator interface which will be use as a sorting logic to sort list of Students
        Comparator<Student> studentComparator = (student1, student2) -> {
            if(student1.marks<student2.marks) return -1;
            else return 1;
        };

        // we want to sort the list of students based on their marks 
        // to sort it, we have sort() method under Collections class which takes 2 argument viz list and an object of Comparator interface which is a functional interface
        // since 2 arg should be functional interface, we can pass lambda expression to it defining the sorting logic 
        Collections.sort(students, studentComparator);

        for(Student student : students) {
            System.out.println(String.format("Name : %s Marks : %f", student.name, student.marks));
        }
    }
}


