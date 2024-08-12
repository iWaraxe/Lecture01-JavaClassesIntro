package com.coherentsolutions.java.section01;

/**
 * A simple Java class to demonstrate regular class features including state and behavior encapsulation.
 */
public class Ex01Car {
    private String make;
    private String model;

    public Ex01Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Car: " + make + " " + model);
    }

    public static void main(String[] args) {
        Ex01Car car = new Ex01Car("Toyota", "Corolla");
        car.displayInfo();
    }
}
