/*
    code to demonstrate how to deal with static method of interface 
*/

package com.excercise.javaDefaultAndStaticMethods.example3;

public class Demo {

    public static void main(String[] args) {
        
        String str = "Abhishek Pandey";
        // calling static methods of interface using interface name 
        long vowelsCount = UtilityInterface.countVowels(str);
        long charCount = UtilityInterface.countCharacter(str, 'e');
        System.out.println(String.format("Vowels count in %s : %d", str, vowelsCount));
        System.out.println(String.format("'e' count in %s : %d", str, charCount));
    }
}