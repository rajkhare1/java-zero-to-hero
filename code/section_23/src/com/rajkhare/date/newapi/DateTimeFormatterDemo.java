package com.rajkhare.date.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterDemo {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2015, 3, 18);// 2015-03-18
        LocalTime localTime = LocalTime.of(15, 30, 0);// 15:30
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);// 2015-03-18T15:30

        DateTimeFormatter dateTimeFormatterLD = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedLocalDate = dateTimeFormatterLD.format(localDate);// 2015/03/18

        DateTimeFormatter dateTimeFormatterLT = DateTimeFormatter.ofPattern("h:mm a");
        String formattedLocalTime = dateTimeFormatterLT.format(localTime);// 3:30 PM

        DateTimeFormatter dateTimeFormatterLDT = DateTimeFormatter.ofPattern("dd/MM/yyyy h:mm a");
        String formattedLocalDateTime = dateTimeFormatterLDT.format(localDateTime);// 18/03/2015 3:30 PM

        // Same output directly
        String formattedLDT = localDateTime.format(dateTimeFormatterLDT);// 18/03/2015 3:30 PM
        String formattedLDTByConstant = localDateTime.format(DateTimeFormatter.BASIC_ISO_DATE);// 20150318
        String formattedLDTByConstant1 = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);// 2015-03-18T15:30:00

        // ADVANCED SUPPORT FOR DATE TIME FORMATTING
        DateTimeFormatter germanDateTimeFormatter = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.GERMAN);
        String formattedGermanLD = germanDateTimeFormatter.format(localDate);// 18. März 2015

    }


}
