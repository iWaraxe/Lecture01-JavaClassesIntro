package com.coherentsolutions.java.section04;

/**
 * This record represents a person with a name and age.
 * Records provide a compact syntax for creating data-carrying classes.
 */
public record Ex01Person(String name, int age) {

    /**
     * Main method to demonstrate the instantiation and usage of the Person record.
     */
    public static void main(String[] args) {
        Ex01Person person = new Ex01Person("John Doe", 30);
        System.out.println(person);
    }
}
