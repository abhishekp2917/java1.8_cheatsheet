/* 
    Code to demonstrate how to use Consumer interface 
*/

package com.excercise.predefinedFunctionalInterface.consumer.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Demo {
    
    public static void main(String[] args) {
        
        // creating function of Consumer type which will accept Student object and will print its details
        // as it is of type Consumer, it doesn't return anything 
        Consumer<Student> displayStudent = (student) -> {
            System.out.println(String.format("[Name : %s, Marks : %f]", student.name, student.marks));
        };

        // creating list of students
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Abhishek", 8),
            new Student("Ravi", 9),
            new Student("Tushar", 10)
        ));

        for(Student student : students) {
            // calling accept() method which will display students details in a way that is defined in lambda expression
            displayStudent.accept(student);
        }
    }
}
