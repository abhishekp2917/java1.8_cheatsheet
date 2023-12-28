/*
    Code to demonstrate how to use filter method on stream
*/

package com.excercise.streams.intermediateMethods.example1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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

        // calling stream() method on collections will return stream of it
        // calling filter method by passing Predicate and based on the boolean value on calling the Predicate, elements of the list will be filtered out
        // in this case filter() method will select only those Person object whose age is greater than 25
        List<Person> personsOlderThan25 = persons.stream()
                .filter(person -> person.age > 25)
                .collect(Collectors.toList());

        for(Person person : personsOlderThan25) System.out.println(person);
    }
}
