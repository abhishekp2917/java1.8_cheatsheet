/*
    Code to demonstrate how to convert stream into an array
*/

package com.excercise.streams.terminalMethods.example5;

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

        // using toArray() to convert age stream into an array of type Integer
        Integer[] personsAge = persons.stream()
            .map(person->person.age)
            .toArray(Integer[]::new);

        for(int age : personsAge) System.out.println(age);
    }
}
