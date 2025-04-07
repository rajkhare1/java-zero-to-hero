package com.rajkhare.date.newapi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

    public static void main(String[] args) {
        LocalDate  localDate1 = LocalDate.of(2013,1,1);// 2013-01-01
        LocalDate  localDate2 = LocalDate.of(2015,3,18);// 2015-03-18
        Period period = Period.between(localDate1, localDate2);// P2Y2M17D

        Period oneYearsTwoMonths = Period.of(1, 2, 0);// P1Y2M
        Period threeDays = Period.ofDays(3);// P3D

        // creating LocalDate Object with the help of Period
        LocalDate localDate3 = localDate1.plus(oneYearsTwoMonths);// 2014-03-01
    }

}
