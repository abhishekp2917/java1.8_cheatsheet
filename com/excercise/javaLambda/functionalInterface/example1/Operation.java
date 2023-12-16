package com.excercise.javaLambda.functionalInterface.example1;

// as this interface has been annotated with @FunctionalInterface, it must have only 1 abstract method
// if this interface has more or less than 1 abstract method, then we will get compile time error
@FunctionalInterface
public interface Operation {
    
    public int operate(int a, int b);
}
