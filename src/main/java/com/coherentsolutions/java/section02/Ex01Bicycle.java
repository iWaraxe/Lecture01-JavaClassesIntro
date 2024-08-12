package com.coherentsolutions.java.section02;

/**
 * Represents a simple bicycle with adjustable speed and gear.
 * This class demonstrates basic principles of object-oriented programming such as encapsulation.
 */
public class Ex01Bicycle {
    private int gear;
    private int speed;

    /**
     * Constructs a new bicycle with specified speed and gear.
     *
     * @param startSpeed Initial speed of the bicycle.
     * @param startGear Initial gear of the bicycle.
     */
    public Ex01Bicycle(int startSpeed, int startGear) {
        gear = startGear;
        speed = startSpeed;
    }

    /**
     * Increases the gear by one.
     */
    public void increaseGear() {
        gear++;
    }

    /**
     * Increases the speed by a specified increment.
     *
     * @param increment The amount by which to increase the speed.
     */
    public void speedUp(int increment) {
        speed += increment;
    }

    /**
     * Main method to demonstrate the functionality of the Bicycle class.
     */
    public static void main(String[] args) {
        Ex01Bicycle myBike = new Ex01Bicycle(10, 3);
        myBike.speedUp(5);
        myBike.increaseGear();
        System.out.println("Current speed: " + myBike.speed + " Current gear: " + myBike.gear);
    }
}
