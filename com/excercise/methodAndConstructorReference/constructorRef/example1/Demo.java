/*
    Code to demonstrate how to use constructor reference which doesn't take any input parameter
*/

package com.excercise.methodAndConstructorReference.constructorRef.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Demo {
    
    public static void main(String[] args) {

        // creating List reference but not instantiating it. It will be instantiated using constructor reference
        List<Integer> list;
        // using Supplier which return List<Integer> as we are calling constructor that doesn't take any argument. 
        // Supplier doesn't expects any input argument but returns something. In this case it will return List<Integer>
        Supplier<List<Integer>> supplier = ArrayList::new;

        // calling 'get()' method will call ArrayList constructor and will return object of it
        list = supplier.get();

        // once 'list' has been instantiated, add values to it and print the list 
        list.add(10);
        list.add(11);
        System.out.println(list);
    }
}
