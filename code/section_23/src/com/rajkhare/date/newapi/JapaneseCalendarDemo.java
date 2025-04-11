package com.rajkhare.date.newapi;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;

public class JapaneseCalendarDemo {

    public static void main(String[] args) {
        JapaneseDate  japaneseDate = JapaneseDate.now();// Japanese Reiwa 7-04-10
        LocalDate localDate = LocalDate.now();// 2025-04-10

        JapaneseDate japaneseDate1 = JapaneseDate.from(localDate);// Japanese Reiwa 7-04-10
        LocalDate localDate1 = LocalDate.from(japaneseDate);// 2025-04-10
    }

}
