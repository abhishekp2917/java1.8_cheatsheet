/*
    Code to demonstrate how to use reduce method on stream
*/

package com.excercise.streams.terminalMethods.example4;

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

        // calling reduce method to reduce entire list into single value i.e. sum of age of all persons 
        // the first argument is intial value 
        // the second argument is a BinaryOperator whose first parameter is accumlator while second one is elements of the stream
        long totalAge = persons.stream()
            .map(person -> person.age)
            .reduce(1000, (currSum, age) -> currSum + age);

        System.out.println(String.format("Sum of the age of employee : %d", totalAge));
    }
}
