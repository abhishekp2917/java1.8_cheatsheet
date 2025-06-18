/*
    Code to demonstrate common Optional<T> methods:
    1. Presence Checking
    2. Accessing the Value
    3. Providing Default Values
    4. Conditionally Executing Logic
*/

package com.excercise.optional.example1;

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {

        // isPresent(): returns true if value is present
        Optional<String> name = Optional.of("John");
        if (name.isPresent()) {
            System.out.println("isPresent: " + name.get());  // prints "John"
        }

        // isEmpty(): returns true if value is absent
        Optional<String> empty = Optional.empty();
        System.out.println("isEmpty: " + empty.isEmpty());  // prints true


        // get(): returns value if present, else throws NoSuchElementException
        Optional<String> anotherName = Optional.of("John");
        System.out.println("get(): " + anotherName.get());  // prints "John"


        // orElse(T other): returns value if present, otherwise given default
        Optional<String> defaultExample = Optional.empty();
        String result = defaultExample.orElse("Default");
        System.out.println("orElse: " + result);  // prints "Default"

        
        // orElseThrow(): throws NoSuchElementException if value is absent
        Optional<String> value = Optional.of("value");
        String finalResult = value.orElseThrow();  // does not throw
        System.out.println("orElseThrow: " + finalResult);  // prints "value"


        // ifPresent(Consumer): executes logic if value exists
        Optional.of("John").ifPresent(val -> System.out.println("Hello, " + val));


        // ifPresentOrElse(...): runs if-present or else code
        Optional.ofNullable(null)
            .ifPresentOrElse(
                val -> System.out.println("Value: " + val),
                () -> System.out.println("No value")
            );
    }
}
