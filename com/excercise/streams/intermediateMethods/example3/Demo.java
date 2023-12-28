/*
    Code to demonstrate how to use sorted method on stream
*/

package com.excercise.streams.intermediateMethods.example3;

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

        // calling sorted() method on stream will sort the list based on the Comparator provided as an argument to it
        List<Person> personsSortedByAge = persons.stream()
                .sorted((p1, p2) -> Integer.compare(p1.age, p2.age))
                .collect(Collectors.toList());

        for(Person person : personsSortedByAge) System.out.println(person);
    }
}
