package com.excercise.defaultAndStaticMethods.example2;

public interface MyInterfaceA {
    
    // defining default method inside an interface 
    default void myDefaultMethod() {
        System.out.println("Default method implementation of MyInterfaceA");
    }
}
