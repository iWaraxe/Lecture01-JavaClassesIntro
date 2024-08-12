package com.coherentsolutions.java.section03;

/**
 * Enum to represent the days of the week. This demonstrates basic enum usage.
 */
public enum Ex01Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    /**
     * Main method to demonstrate the usage of the Day enum.
     */
    public static void main(String[] args) {
        for (Ex01Day day : Ex01Day.values()) {
            System.out.println(day);
        }
    }
}
