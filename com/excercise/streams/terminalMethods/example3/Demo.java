/*
    Code to demonstrate how to use count method on stream
*/

package com.excercise.streams.terminalMethods.example3;

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

        // calling count() will return the count of elements in the list after executing intermediate methods
        long count = persons.stream()
            .filter(person -> person.age > 25)
            .count();

        System.out.println(String.format("Number of employees having age greater than 25 : %d", count));
    }
}
