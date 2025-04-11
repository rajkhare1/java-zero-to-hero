package com.rajkhare.date.newapi;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeDemo {

    public static void main(String[] args) {
        ZoneOffset offset = ZoneOffset.ofHours(2);// +02:00
        ZoneOffset destOffset = ZoneOffset.ofHours(-8);// -08:00

        OffsetDateTime offsetDateTime = OffsetDateTime.now(offset);// 2025-04-09T14:51:34.650503+02:00
        OffsetDateTime destOffsetDateTime = offsetDateTime.withOffsetSameInstant(destOffset);// 2025-04-09T04:51:34.650503-08:00
    }

}
