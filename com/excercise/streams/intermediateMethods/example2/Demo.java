/*
    Code to demonstrate how to use map method on stream
*/

package com.excercise.streams.intermediateMethods.example2;

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
        // calling map method by passing Function which will convert Person names to upper case and will it. As it returns Person object, new list will be of Person
        List<Person> personsWithUppercaseName = persons.stream()
                .map(person -> {
                    person.name.toUpperCase(); 
                    return person;
                })
                .collect(Collectors.toList());

        for(Person person : personsWithUppercaseName) System.out.println(person);
    }
}
