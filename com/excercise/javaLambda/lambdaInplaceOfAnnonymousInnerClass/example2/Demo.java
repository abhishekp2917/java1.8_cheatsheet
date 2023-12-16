/*
    code to demonstrate how can we use lambda expression inplace of annonymous inner class
*/

package com.excercise.javaLambda.lambdaInplaceOfAnnonymousInnerClass.example2;

public class Demo {

    public static void main(String[] args) {
        
        // creating implementation class of Runnable interface using lambda expression
        // since Runnable is a functional interface having 1 method .e. run(), we can use Runnable to hold lambda expression
        Runnable runnable = () -> { for(int i=0; i<10; i++) System.out.println("Child thread"); };

        // creating Thread object by passing runnable object
        Thread t = new Thread(runnable);
        t.start();

        // given below is part of main thread
        for(int i=0; i<10; i++) System.out.println("Main thread");
    }
}

