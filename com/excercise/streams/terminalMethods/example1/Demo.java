/*
    Code to demonstrate how to use collect method on stream
*/

package com.excercise.streams.terminalMethods.example1;

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

        // calling collect() method will execute the intermediate methods and will create a new Collection of type provided in the argument (in this case it's list)
        List<Person> personsOlderThan25 = persons.stream()
                .filter(person -> person.age > 25)
                .collect(Collectors.toList());

        for(Person person : personsOlderThan25) System.out.println(person);
    }
}
