/*
    Code to demonstrate how to use constructor reference which takes argument
*/

package com.excercise.methodAndConstructorReference.constructorRef.example2;

import java.util.function.BiFunction;

public class Demo {
    
    public static void main(String[] args) {

        // creating Student reference but not instantiating it. It will be instantiated using constructor reference
        Student student;
        // using BiFunction which takes 2 arument of String and Float type and return Student type object 
        // Student constructor also expects 2 argument 
        BiFunction<String, Float, Student> function = Student::new;

        // calling 'apply()' method will call Student constructor by passing arguments and will return object of it
        student = function.apply("Abhishek", 9.2f);

        System.out.println(String.format("[Name : %s, Marks : %f]", student.name, student.marks));
    }
}