package com.coherentsolutions.java.section02;

/**
 * Represents a mountain bike that is an extension of the basic bicycle, including additional features like seat height adjustment.
 */
public class Ex02MountainBike extends Ex01Bicycle {
    private int seatHeight;

    /**
     * Constructs a MountainBike object with specified height, speed, and gear.
     *
     * @param startHeight Initial seat height of the mountain bike.
     * @param startSpeed Initial speed of the mountain bike.
     * @param startGear Initial gear of the mountain bike.
     */
    public Ex02MountainBike(int startHeight, int startSpeed, int startGear) {
        super(startSpeed, startGear);
        seatHeight = startHeight;
    }

    /**
     * Adjusts the seat height by a given adjustment value.
     *
     * @param adjustment The amount to adjust the seat height.
     */
    public void adjustSeatHeight(int adjustment) {
        seatHeight += adjustment;
    }

    /**
     * Main method to demonstrate the functionality of the MountainBike class.
     */
    public static void main(String[] args) {
        Ex02MountainBike myMountainBike = new Ex02MountainBike(5, 10, 3);
        myMountainBike.adjustSeatHeight(3);
        System.out.println("New seat height: " + myMountainBike.seatHeight);
    }
}
