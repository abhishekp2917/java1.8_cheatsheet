/* 
    Code to demonstrate how to use static method of Function interface 
*/

package com.excercise.predefinedFunctionalInterface.function.example3;

import java.util.function.Function;

public class Demo {
    
    public static void main(String[] args) {
        
        // identity() function returns the Function which on applying returns the same argument
        Function<Integer, Integer> function = Function.identity();
        System.out.println(function.apply(5));
    }
}
