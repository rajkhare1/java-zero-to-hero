package com.rajkhare.date.newapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDSTDemo {

    public static void main(String[] args) {
        // Flight departure in PST
        ZonedDateTime departure = ZonedDateTime.of(2024, 3, 9, 21, 0, 0, 0, ZoneId.of("America/Los_Angeles"));// 2024-03-09T21:00-08:00[America/Los_Angeles]
        // Expected arrival in NYC (assuming flight duration is 4 hours in EST)
        ZonedDateTime arrival = departure.plusHours(4).withZoneSameInstant(ZoneId.of("America/New_York"));//2024-03-10T05:00-04:00[America/New_York]
    }

}
