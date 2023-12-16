/*
    code to demonstrate how to use lambda expression using functional interface

    this will show how lambda expression shortens the code length of functional interface
*/

package com.excercise.javaLambda.lambdaWithFunctionalInterface.example1;

public class Demo {

    public static void main(String[] args) {
        
        // creating obejct of functional interface 'Operation' using lambda expression
        // here 'Operation' functional interface is use to hold the lambda expression
        Operation addition = (a, b) -> (a + b);
        Operation multiplication = (a, b) -> a*b;

        // calling performOperation by passing lambda expression in place of functional interface parameter
        performOperation(addition, 10, 20);
        performOperation(multiplication, 10, 20);
    }

    // this method takes functional interface as an argument and calls its sole method  
    private static void performOperation(Operation operation, int a, int b) {
        System.out.println(String.format("Result of operation on %d and %d is %d", a, b, operation.operate(a, b)));
    }
}

