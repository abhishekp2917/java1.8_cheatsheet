/* 
    Code to demonstrate how to parse various date and time 
*/

package com.excercise.dateAndTimeAPI.localeDateAndTime.example2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Demo {
    
    public static void main(String[] args) {

        // parsing date string into LocalDate 
        LocalDate customDate = LocalDate.parse("2023-01-01");
        System.out.println(String.format("Date : %d-%d-%d", customDate.getYear(), customDate.getMonthValue(), customDate.getDayOfMonth()));

        // parsing time string into LocalTime
        LocalTime customTime = LocalTime.parse("10:40:38");
        System.out.println(String.format("Time : %d:%d:%d:%d", customTime.getHour(), customTime.getMinute(), customTime.getSecond(), customTime.getNano()));

        // parsing date and time string inti LocalDateTime
        LocalDateTime customDateTime = LocalDateTime.parse("2023-12-31T18:30:45");
        System.out.println(String.format("Date and Time : %d-%d-%d  %d:%d:%d:%d", customDateTime.getYear(), customDateTime.getMonthValue(), customDateTime.getDayOfMonth(), customDateTime.getHour(), customDateTime.getMinute(), customDateTime.getSecond(), customDateTime.getNano()));

        // parsing date and time of a specific format into LocalDateTime using DateTimeFormatter 
        String customDateTimeString = "Dec 31, 2023 06:30 PM";
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm a", Locale.ENGLISH);
        LocalDateTime parsedCustomDateTime = LocalDateTime.parse(customDateTimeString, customFormatter);
        System.out.println(String.format("Date and Time : %d-%d-%d  %d:%d:%d:%d", parsedCustomDateTime.getYear(), parsedCustomDateTime.getMonthValue(), parsedCustomDateTime.getDayOfMonth(), parsedCustomDateTime.getHour(), parsedCustomDateTime.getMinute(), parsedCustomDateTime.getSecond(), parsedCustomDateTime.getNano()));
    }
}
