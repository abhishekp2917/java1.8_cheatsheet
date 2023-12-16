package com.excercise.javaLambda.lambdaWithFunctionalInterface.example1;


// functional interface that has only 1 abstract method which takes 2 integer argument
@FunctionalInterface
public interface Operation {
    
    public int operate(int a, int b);
}
