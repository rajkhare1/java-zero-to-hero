package com.rajkhare.lambda.exercise;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Exercise6 {

    public static void main(String[] args) {
        System.out.println(getCurrentDayNameSupplier());
    }

    public static String getCurrentDayNameSupplier() {
        // Write your logic below
        Supplier<String> getCurrentDayName = () -> LocalDate.now().getDayOfWeek().name();

        return getCurrentDayName.get();
    }

}
