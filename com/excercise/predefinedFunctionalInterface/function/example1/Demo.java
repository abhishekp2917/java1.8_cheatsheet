/* 
    Code to demonstrate how to use Function interface 
*/

package com.excercise.predefinedFunctionalInterface.function.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Demo {
    
    public static void main(String[] args) {
        
        // creating object of type Function using lambda expression
        // this function accepts String argument and returns String after removing spaces
        Function<String, String> removeSpaces = (str) -> {
            String temp = "";
            for(int i=0; i<str.length(); i++) if(str.charAt(i)!=' ') temp += str.charAt(i);
            return temp;
        };

        // list of some random strings
        ArrayList<String> list = new ArrayList<>(Arrays.asList("abc def", "Hello World", "Good By World")); 

        for(String str : list) {
            // calling apply() method of Function interface which will return the string after removing the spaces
            String transformedString = removeSpaces.apply(str);
            System.out.println(transformedString);
        }
    }
}
