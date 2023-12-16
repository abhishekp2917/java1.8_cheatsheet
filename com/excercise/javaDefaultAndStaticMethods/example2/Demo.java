/*
    code to demonstrate how using annonymous inner class makes code lengthy
*/

package com.excercise.javaDefaultAndStaticMethods.example2;

public class Demo {

    public static void main(String[] args) {
        
        MyClassA myClassA = new MyClassA();
        myClassA.myDefaultMethod();

        MyClassB myClassB = new MyClassB();
        myClassB.myDefaultMethod();
    }
}

// implementing both the interfaces which has same default method signature
class MyClassA implements MyInterfaceA, MyInterfaceB {
    
    // as both interface has same default method signature, we have to override the default method to resolve 
    // the conflict
    @Override   
    public void myDefaultMethod() {
        System.out.println("Overriden method implementation");
    }
}

// implementing both the interfaces which has same default method signature
class MyClassB implements MyInterfaceA, MyInterfaceB {
    
    // we want to keep the default implemenation of MyInterfaceA, which can be achievable by using 'MyInterfaceA' super keyword
    @Override   
    public void myDefaultMethod() {
        MyInterfaceA.super.myDefaultMethod();
    }
}
