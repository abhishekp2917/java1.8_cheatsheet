/* 
    Code to demonstrate how to get date and time of a specific zone
*/

package com.excercise.dateAndTimeAPI.zonedDateTime.example1;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo {
    
    public static void main(String[] args) {

        // getting London zone id
        ZoneId europeZoneId = ZoneId.of("Europe/London");

        // getting New York zone id
        ZoneId newYorkZoneId = ZoneId.of("America/New_York");

        // getting ZoneDateTime of London using London zone id 
        ZonedDateTime europeDateTime = ZonedDateTime.now(europeZoneId); 

        // getting ZoneDateTime of New York using New York zone id
        ZonedDateTime newYorkDateTime = ZonedDateTime.now(newYorkZoneId); 
        
        System.out.println(String.format("Date and Time : %d-%d-%d  %d:%d:%d:%d", europeDateTime.getYear(), europeDateTime.getMonthValue(), europeDateTime.getDayOfMonth(), europeDateTime.getHour(), europeDateTime.getMinute(), europeDateTime.getSecond(), europeDateTime.getNano()));
        System.out.println(String.format("Date and Time : %d-%d-%d  %d:%d:%d:%d", newYorkDateTime.getYear(), newYorkDateTime.getMonthValue(), newYorkDateTime.getDayOfMonth(), newYorkDateTime.getHour(), newYorkDateTime.getMinute(), newYorkDateTime.getSecond(), newYorkDateTime.getNano()));
    }
}
