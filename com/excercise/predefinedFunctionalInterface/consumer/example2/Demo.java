/* 
    Code to demonstrate how to use default methods of Consumer interface 
*/

package com.excercise.predefinedFunctionalInterface.consumer.example2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;

public class Demo {
    
    public static void main(String[] args) {
        
        // creating Consumer function which will accept List of Student and will sort them based on their marks in ascending order 
        Consumer<List<Student>> sortStudents = students -> {
            Collections.sort(students, (student1, student2) -> {
                if(student1.marks<student2.marks) return -1;
                else return 1;
            });
        };

        // creating Consumer function which will accept List of Student and will display their details in some certain format
        Consumer<List<Student>> displayStudents = students -> {
            for(Student student : students) 
                System.out.println(String.format("[Name : %s, Marks : %f]", student.name, student.marks));
        };

        // creating list of students
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Abhishek", 10),
            new Student("Ravi", 7),
            new Student("Tushar", 9)
        ));

        // joining both of the above given Consumer function using andThen() in which Consumer passed as an argument will be called later
        sortStudents.andThen(displayStudents).accept(students);
    }
}
