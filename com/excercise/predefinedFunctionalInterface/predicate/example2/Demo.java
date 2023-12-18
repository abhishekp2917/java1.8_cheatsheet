/*
    Code to demonstrate default methods of Predicate interface 
*/

package com.excercise.predefinedFunctionalInterface.predicate.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo {
    
    public static void main(String[] args) {
        
        // Predicate to check if the passed number is even
        Predicate<Integer> isEven = (num) -> num%2==0;
        // Predicate to check if the passed number is greater than 10
        Predicate<Integer> isGreaterThan10 = (num) -> num>10;

        // creating list of numbers which will be tested by the above given predicates
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 30, 6, 23, 9, 3, 34, 25, 11));

        // list to store all the odd numbers
        List<Integer> oddNumbers = new ArrayList<>();
        // list to store all the number which are either even or greater than 10
        List<Integer> evenOrGreaterThan10Numbers = new ArrayList<>();
        // list to store all the number which are even as well as greater than 10
        List<Integer> evenAndGreaterThan10Numbers = new ArrayList<>();

        for(int num : nums) {
            // using negate() will return a predicate which will return negation of actual predicate
            if(isEven.negate().test(num)) oddNumbers.add(num);
            // using or() will return a predicate which will test if either P1 is true or P2
            if(isEven.or(isGreaterThan10).test(num)) evenOrGreaterThan10Numbers.add(num);
            // using and() will return a predicate which will test if P1 and P2 both are true
            if(isEven.and(isGreaterThan10).test(num)) evenAndGreaterThan10Numbers.add(num);
        }

        System.out.println("Numbers that are odd : " + oddNumbers);
        System.out.println("Numbers that are either even or greater than 10 : " + evenOrGreaterThan10Numbers);
        System.out.println("Numbers that are even as well as greater than 10 : " + evenAndGreaterThan10Numbers);
    }
}
