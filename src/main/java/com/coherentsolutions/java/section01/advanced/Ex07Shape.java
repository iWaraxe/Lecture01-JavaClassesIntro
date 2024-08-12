package com.coherentsolutions.java.section01.advanced;

/**
 * A sealed class to demonstrate controlled inheritance in Java.
 * Here, only specific classes can extend the Shape class.
 */
public sealed abstract class Ex07Shape permits Ex07Circle, Ex07Square {
    public abstract double area();
}

