/* 
    Code to demonstrate how to get difference between two date using Period
*/

package com.excercise.dateAndTimeAPI.period.example1;

import java.time.LocalDate;
import java.time.Period;

public class Demo {
    
    public static void main(String[] args) {

        // defining start and end date
        LocalDate starDate = LocalDate.parse("2021-01-29");
        LocalDate endDate = LocalDate.parse("2023-10-30");

        // getting period difference between start and end date
        Period period = Period.between(starDate, endDate);
        System.out.println(String.format("Period difference : %d year(s) %d month(s) %d day(s)", period.getYears(), period.getMonths(), period.getDays()));
    }
}
