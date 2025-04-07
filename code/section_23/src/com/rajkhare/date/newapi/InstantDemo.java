package com.rajkhare.date.newapi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class InstantDemo {

    public static void main(String[] args) {
        Instant i1 = Instant.ofEpochSecond(1000);// 1970-01-01T00:16:40Z
        Instant i2 = Instant.now();// 2025-04-06T23:43:48.667707Z

        long epochSecond = i2.getEpochSecond();// 1743983236
        int nanoSeconds  = i2.getNano();// 642115000

        Duration d1 = Duration.ofDays(5);// PT120H
        Duration d2 = Duration.ofMinutes(10);// PT10M
        Duration d3 = Duration.ofSeconds(30);//PT30S
        Duration d4 = Duration.ofSeconds(-13);// PT-13S
        Duration d5 = d3.plus(d4);// PT17S

        Instant i3 = i1.plus(d1);// 1970-01-06T00:16:40Z
        Instant i4 = i2.minus(d2);// 2025-04-07T13:34:49.871942Z

        boolean isAfter = i3.isAfter(i4);// false
        boolean isBefore = i3.isBefore(i4);// true

        Duration duration = Duration.between(i1, i3);// PT120H


    }

}
