/*
    Code to demonstrate how to use method reference of instance method.  
*/

package com.excercise.methodAndConstructorReference.methodRef.example2;

import java.util.function.Consumer;

public class Demo {
    
    public static void main(String[] args) {
        
        // creating Printer object to use it to refer it's instance method 'display()' 
        Printer p = new Printer();

        // using Consumer to hold method reference as it has same method signature and return type as Printer class
        // static method
        // to ref instance method, use Class object (in case it's 'p') followed by '::' and method name (in case it's display)
        Consumer<String> messagePrinter = p::display;

        // calling accept method will call display method
        messagePrinter.accept("Hello world");
    }
}

// Printer class which has instance method display() that accepts string and performs operation
class Printer {
    public void display(String message) {
        System.out.println(String.format("Message is : %s", message));
    }
}