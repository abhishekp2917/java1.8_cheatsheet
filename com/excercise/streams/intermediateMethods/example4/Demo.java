/*
    Code to demonstrate how to use skip and limit methods on stream
*/

package com.excercise.streams.intermediateMethods.example4;

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

        // calling skip() method will skip the first N elements of the list (in this case it's 2) and will start from N+1th element
        // calling limit() method will limit the size of list to N (in this case it's 3) 
        List<Person> distinctPersons = persons.stream()
                .skip(2)
                .limit(3)
                .collect(Collectors.toList());

        for(Person person : distinctPersons) System.out.println(person);
    }
}
