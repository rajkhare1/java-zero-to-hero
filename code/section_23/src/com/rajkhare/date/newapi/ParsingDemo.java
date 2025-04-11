package com.rajkhare.date.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParsingDemo {

    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String dateString = "2015-03-18";// same format you must follow in DTF
        String timeString = "15:30:00";// same format you must follow in DTF
        String dateTimeString = "18/03/2015 15:30:00";// same format you must follow in DTF

        // Parsing date - Str -> date Obj
        LocalDate parsedLocalDate = LocalDate.parse(dateString, dateFormatter);// 2015-03-18
        LocalTime parsedLocalTime = LocalTime.parse(timeString, timeFormatter);// 15:30
        LocalDateTime parsedLocalDateTime = LocalDateTime.parse(dateTimeString, dateTimeFormatter);// 2015-03-18T15:30

    }

}
