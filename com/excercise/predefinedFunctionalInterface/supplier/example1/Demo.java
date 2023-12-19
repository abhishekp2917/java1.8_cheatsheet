/* 
    Code to demonstrate how to use Supplier interface 
*/

package com.excercise.predefinedFunctionalInterface.supplier.example1;

import java.util.function.Supplier;

public class Demo {
    
    public static void main(String[] args) {
        
        // creating Supplier fnction which will return a random 6 digit OTP in string format
        Supplier<String> getOTP = () -> {
            String otp = "";
            for(int i=0; i<6; i++) {
                otp += (int)(Math.random()*10);
            }
            return otp;
        };

        // calling get() method wich will execute the logic inside lambda expression and will return otp 
        System.out.println(getOTP.get());
    }
}
