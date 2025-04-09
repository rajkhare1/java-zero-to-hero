package com.rajkhare.date.newapi;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

    public static void main(String[] args) {
        ZoneId indiaZone = ZoneId.of("Asia/Kolkata");// Asia/Kolkata
        ZoneId chicagoZone = ZoneId.of("America/Chicago");// America/Chicago

        ZonedDateTime indiaDateTime = ZonedDateTime.now(indiaZone);// 2025-04-09T04:52:35.312019+05:30[Asia/Kolkata]
        ZonedDateTime chicagoDateTime = indiaDateTime.withZoneSameInstant(chicagoZone);// 2025-04-08T18:26:01.630386-05:00[America/Chicago]

        ZoneOffset offset = ZoneOffset.ofHours(2);// +02:00
        ZoneOffset destOffset = ZoneOffset.ofHours(-8);

        ZonedDateTime utc2DateTime = ZonedDateTime.now(offset);// 2025-04-09T12:16:49.580253300+02:00
        ZonedDateTime utcDestDateTime = ZonedDateTime.now(destOffset);// 2025-04-09T02:16:49.580253300-08:00
    }

}
