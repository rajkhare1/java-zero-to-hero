package com.rajkhare.date.newapi;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantDemo {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(1000);// 1970-01-01T00:16:40Z
        Instant instantCurrent = Instant.now();// 2025-04-06T23:43:48.667707Z

        long epochSecond = instantCurrent.getEpochSecond();// 1743983236
        int nano = instantCurrent.getNano();// 642115000

        LocalDateTime localDateTime = LocalDateTime.now();// 2025-04-07T05:13:48.747571
    }

}
