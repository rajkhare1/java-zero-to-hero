package com.rajkhare.date.newapi;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TruncatedToMethodDemo {

    public static void main(String[] args) {
        Duration duration = Duration.ofDays(28).plusHours(6).plusMinutes(56).plusSeconds(19);// PT678H56M19S
        Duration truncatedDays = duration.truncatedTo(ChronoUnit.DAYS);// PT672H
        Duration truncatedHours = duration.truncatedTo(ChronoUnit.HOURS);// PT678H
        Duration truncatedMinutes = duration.truncatedTo(ChronoUnit.MINUTES);// PT678H56M
    }

}
