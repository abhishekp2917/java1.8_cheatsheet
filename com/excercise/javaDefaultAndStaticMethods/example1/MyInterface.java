package com.excercise.javaDefaultAndStaticMethods.example1;

public interface MyInterface {
    
    // defining default method inside an interface 
    default void myDefaultMethod() {
        System.out.println("Default method implementation");
    }

    // method overloading of default method
    default void myDefaultMethod(String message) {
        System.out.println("Default method implementation : " + message);
    }
}
