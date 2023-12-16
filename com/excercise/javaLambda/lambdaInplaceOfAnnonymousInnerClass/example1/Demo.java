/*
    code to demonstrate how using annonymous inner class makes code lengthy
*/

package com.excercise.javaLambda.lambdaInplaceOfAnnonymousInnerClass.example1;

public class Demo {

    public static void main(String[] args) {
        
        // creating implementation class of Runnable functional interface using annoymous inner class which will be use by 
        // Thread object to call run() method
        Runnable runnable = new Runnable() {

            // providing implemenatation of run() method which will be part of child thread
            public void run() {
                for(int i=0; i<10; i++) System.out.println("Child thread");
            }
        };

        // creating Thread object by passing runnable object
        Thread t = new Thread(runnable);
        t.start();

        // given below is part of main thread
        for(int i=0; i<10; i++) System.out.println("Main thread");
    }
}

