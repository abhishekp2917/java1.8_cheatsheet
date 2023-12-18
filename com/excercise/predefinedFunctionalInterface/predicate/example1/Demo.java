/* 
    Code to demonstrate how to use Predicate interface 
*/

package com.excercise.predefinedFunctionalInterface.predicate.example1;

import java.util.function.Predicate;

public class Demo {
    
    public static void main(String[] args) {
        
        Predicate<Integer> isEven = (num) -> num%2==0;

        for(int i=0; i<10; i++) {
            boolean testResult = isEven.test(i);
            System.out.println(String.format("%d is Even : %s", i, testResult));
        }
    }
}
