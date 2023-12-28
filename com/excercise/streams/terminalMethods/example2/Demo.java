/*
    Code to demonstrate how to use forEach method on stream
*/

package com.excercise.streams.terminalMethods.example2;

import java.util.Arrays;
import java.util.List;
import com.excercise.streams.Objects.Person;

public class Demo {
    
    public static void main(String[] args) {

        // creating list of Person
        List<Person> persons = Arrays.asList(
            new Person("Alice", 25, "Female"),
            new Person("Bob", 30, "Male"),
            new Person("Charlie", 28, "Male"),
            new Person("David", 22, "Male"),
            new Person("Emma", 27, "Female")
        );

        // calling forEach() method will perform some operation on elements of the list but doesn't return anything
        // it expects a Consumer. Here we have provided implementation of the Consumer using method reference which referring to println() method  
        persons.stream()
        .forEach(System.out::println);
    }
}
