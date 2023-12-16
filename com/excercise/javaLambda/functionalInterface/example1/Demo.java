/*
    code to demonstrate @FunctionalInterface annotation
*/

package com.excercise.javaLambda.functionalInterface.example1;

public class Demo {

    public static void main(String[] args) {
        
        // creating object of type Operation 
        Operation addition = new Addition();
        Operation multiplication = new Muliplication();

        // calling performOperation method by passing Addition class as a functional interface argument
        performOperation(addition, 10, 20);
        // calling performOperation method by passing Multiplication class as a functional interface argument
        performOperation(multiplication, 10, 20);
    }

    // this method takes functional interface as an argument and calls its sole method  
    private static void performOperation(Operation operation, int a, int b) {
        System.out.println(String.format("Result of operation on %d and %d is %d", a, b, operation.operate(a, b)));
    }
}

// Addition class implementing Operation functional interface
class Addition implements Operation {

    // this class operate method returns addition of passed argument
    @Override
    public int operate(int a, int b) {
        return a+b;
    }
}

// Muliplication class implementing Operation functional interface
class Muliplication implements Operation {

    // this class operate method returns multiplication of passed argument
    @Override
    public int operate(int a, int b) {
        return a*b;
    }
}

