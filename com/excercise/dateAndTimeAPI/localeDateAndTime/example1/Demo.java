/* 
    Code to demonstrate how to use LocalDate, LocalTime and LocalDateTime 
*/

package com.excercise.dateAndTimeAPI.localeDateAndTime.example1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo {
    
    public static void main(String[] args) {

        // using now() static method to get current date using LocalDate
        // LocalDate is use only to deal with date 
        LocalDate todayDate = LocalDate.now();
        System.out.println(String.format("Date : %d-%d-%d", todayDate.getYear(), todayDate.getMonthValue(), todayDate.getDayOfMonth()));

        // using now() static method to get current time using LocalTime
        // LocalTime is use only to deal with time
        LocalTime todayTime = LocalTime.now();
        System.out.println(String.format("Time : %d:%d:%d:%d", todayTime.getHour(), todayTime.getMinute(), todayTime.getSecond(), todayTime.getNano()));

        // using now() static method to get current date and time using LocalDateTime
        // LocalDateTime is use to work with date as well as time 
        LocalDateTime todayDateTime = LocalDateTime.now();
        System.out.println(String.format("Date and Time : %d-%d-%d  %d:%d:%d:%d", todayDateTime.getYear(), todayDateTime.getMonthValue(), todayDateTime.getDayOfMonth(), todayDateTime.getHour(), todayDateTime.getMinute(), todayDateTime.getSecond(), todayDateTime.getNano()));
    }
}
