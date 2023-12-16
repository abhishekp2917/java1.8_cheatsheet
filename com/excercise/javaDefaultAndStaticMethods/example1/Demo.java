/*
    code to demonstrate how to deal with default method of interface 
*/

package com.excercise.javaDefaultAndStaticMethods.example1;

public class Demo {

    public static void main(String[] args) {
        
        MyClass myClass = new MyClass();

        // calling default method 
        myClass.myDefaultMethod();
        myClass.myDefaultMethod("Hello Folks");
    }
}

class MyClass implements MyInterface {
    
    // as we aren't overriding 'myDefaultMethod()' default method implementation, this class will use it's original implementation

    // overriding myDefaultMethod(String) default method 
    @Override
    public void myDefaultMethod(String message) {
        System.out.println("Overriding default method : " + message);
    }
}

