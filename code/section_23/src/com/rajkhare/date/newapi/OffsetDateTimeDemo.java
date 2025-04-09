package com.rajkhare.date.newapi;

import java.time.ZoneOffset;

public class OffsetDateTimeDemo {

    public static void main(String[] args) {
        ZoneOffset offset = ZoneOffset.ofHours(2);
        ZoneOffset destOffset = ZoneOffset.ofHours(-8);
    }

}
