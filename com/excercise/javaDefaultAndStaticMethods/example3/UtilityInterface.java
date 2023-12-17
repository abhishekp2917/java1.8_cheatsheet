package com.excercise.javaDefaultAndStaticMethods.example3;

import java.util.Arrays;
import java.util.HashSet;

public interface UtilityInterface {
    
    // static method inside an interface which will return count of vowels in a string
    public static long countVowels(String str) {
        int count = 0;
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for(int i=0; i<str.length(); i++) if(vowels.contains(str.charAt(i))) count++;
        return count;
    }

    // static method inside an interface which will return count of a particular char in a string
    public static long countCharacter(String str, char ch) {
        int count = 0;
        for(int i=0; i<str.length(); i++)  if(str.charAt(i)==ch) count++;
        return count;
    }
}
