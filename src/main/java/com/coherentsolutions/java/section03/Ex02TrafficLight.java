package com.coherentsolutions.java.section03;

/**
 * Enum to represent various states of a traffic light.
 */
public enum Ex02TrafficLight {
    RED, YELLOW, GREEN;
}

/**
 * Class to control traffic lights using an enum.
 */
class Ex02TrafficControl {

    /**
     * Changes the traffic light color and prints action accordingly.
     * @param light The current traffic light state.
     */
    public void changeLight(Ex02TrafficLight light) {
        switch (light) {
            case RED:
                System.out.println("Stop");
                break;
            case YELLOW:
                System.out.println("Prepare to stop");
                break;
            case GREEN:
                System.out.println("Go");
                break;
            default:
                throw new IllegalArgumentException("Unknown light: " + light);
        }
    }

    /**
     * Main method to demonstrate the functionality of traffic light control.
     */
    public static void main(String[] args) {
        Ex02TrafficControl control = new Ex02TrafficControl();
        control.changeLight(Ex02TrafficLight.RED);
        control.changeLight(Ex02TrafficLight.YELLOW);
        control.changeLight(Ex02TrafficLight.GREEN);
    }
}
