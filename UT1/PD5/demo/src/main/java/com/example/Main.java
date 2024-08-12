package com.example;

public class Main {

    public static void main(String[] args) {
        Day[] dias = Day.values();
        for (Day day : dias) {
            System.out.println(day);
        }

        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();

    }

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY 
    }
}