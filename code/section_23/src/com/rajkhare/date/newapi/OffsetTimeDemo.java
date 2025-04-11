package com.rajkhare.date.newapi;

import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OffsetTimeDemo {

    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.of(15, 30, 0, 0, ZoneOffset.ofHours(2));// 15:30+02:00
        int hour = offsetTime.getHour();// 15
        int minute = offsetTime.getMinute();// 30
        int second = offsetTime.getSecond();// 0
        ZoneOffset offset = offsetTime.getOffset();// +02:00
        OffsetTime laterTime = offsetTime.plusHours(2);// 17:30+02:00
        boolean isBefore = offsetTime.isBefore(laterTime);// true
    }

}
