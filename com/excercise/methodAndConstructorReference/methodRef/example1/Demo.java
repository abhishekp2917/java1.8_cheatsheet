/*
    Code to demonstrate how to use method reference of static method.  
*/

package com.excercise.methodAndConstructorReference.methodRef.example1;

import java.util.function.Consumer;

public class Demo {
    
    public static void main(String[] args) {
        
        // using Consumer to hold method reference as it has same method signature and return type as Printer class
        // static method
        // to ref static method, use Class name (in case it's Printer) followed by '::' and method name (in case it's display)
        Consumer<String> messagePrinter = Printer::display;

        // calling accept method will call display method
        messagePrinter.accept("Hello world");
    }
}

// Printer class which has static method display() that accepts string and performs operation
class Printer {

    public static void display(String message) {
        System.out.println(String.format("Message is : %s", message));
    }
}