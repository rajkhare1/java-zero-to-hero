package com.rajkhare.enumuration;

import java.util.EnumSet;
import java.util.logging.Logger;

public class EnumSetDemo {

    private static Logger logger = Logger.getLogger(EnumSetDemo.class.getName());

    public static void main(String[] args) {
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        EnumSet<Day> vacationsDay = EnumSet.of(Day.SATURDAY, Day.SUNDAY, Day.MONDAY);
        for (Day day : vacationsDay) {
            logger.info("vacationsDay: "+day);
        }

        EnumSet<Grades> passGrades = EnumSet.range(Grades.A, Grades.C);
        for (Grades passGrade : passGrades) {
            logger.info("passGrade: "+passGrade);
        }

        EnumSet<Grades> failGrades = EnumSet.complementOf(passGrades);
        for (Grades failGrade : failGrades) {
            logger.info("failGrade: "+failGrade);
        }

    }

}
