package com.rajkhare.date.newapi;

import java.time.*;

public class GetPlusMinusMethodsDemo {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2015, 3, 18);
        int year = localDate.getYear();// 2015
        Month month = localDate.getMonth();// MARCH
        int day = localDate.getDayOfMonth();// 18
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();// WEDNESDAY

        LocalDateTime localDateTime = LocalDateTime.now();// 2025-04-06T15:10:53.431002
        int hour = localDateTime.getHour();// 15

        LocalDate ld1 = localDate.plusDays(6);// 2015-03-24
        LocalDate ld2 = localDate.plusMonths(6);// 2015-09-18
        LocalDate ld3 = localDate.plusWeeks(2);// 2015-04-01

        LocalDate ld4 = localDate.minusMonths(9);// 2014-06-18
        LocalDate ld5 = localDate.minusYears(7);// 2008-03-18


    }

}
