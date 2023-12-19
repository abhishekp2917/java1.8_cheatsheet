/* 
    Code to demonstrate how to use default methods of Function interface 
*/

package com.excercise.predefinedFunctionalInterface.function.example2;

import java.util.function.Function;

public class Demo {
    
    public static void main(String[] args) {
        
        // creating object of type Function interface using lambda expression
        // cube will give cube of a number while thrice will return 3 times of a number
        Function<Integer, Integer> cube = num -> num*num*num;
        Function<Integer, Integer> thrice = num -> 3*num;

        // combining above 2 lambda expression using andThen() will return a function that will first call thrice and then
        // will call cube on the returned value  
        Function<Integer, Integer> cubeOfThrice = thrice.andThen(cube);

        // combining above 2 lambda expression using compose() will return a function that will first call cube and then
        // will call thrice on the returned value 
        Function<Integer, Integer> thriceOfCube = thrice.compose(cube);

        // it will return (3*2)*(3*2)*(3*2)
        System.out.println(String.format("Cube of thrice of number %d is %d", 2, cubeOfThrice.apply(2)));
        // it will return 3*(2*2*2)
        System.out.println(String.format("Thrice of cube of number %d is %d", 2, thriceOfCube.apply(2)));
    }
}
