package com.coherentsolutions.java.section03.advanced;

import com.coherentsolutions.java.section03.Ex01Day;

/**
 * Class to demonstrate the use of enum-specific methods such as values() and valueOf().
 */
public class Ex03EnumMethodsDemo {

    /**
     * Prints all days using the values() method.
     */
    public static void printAllDays() {
        for (Ex01Day day : Ex01Day.values()) {
            System.out.println(day);
        }
    }

    /**
     * Checks and prints the day from its name using the valueOf() method.
     * @param str The name of the day.
     */
    public static void checkDay(String str) {
        Ex01Day day = Ex01Day.valueOf(str);
        System.out.println("It's " + day);
    }

    /**
     * Main method to run demonstrations of enum methods.
     */
    public static void main(String[] args) {
        printAllDays();
        checkDay("MONDAY");  // Use a valid day from the enum Day
    }
}
