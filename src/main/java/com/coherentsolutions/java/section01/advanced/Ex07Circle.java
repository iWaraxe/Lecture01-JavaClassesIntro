package com.coherentsolutions.java.section01.advanced;

public final class Ex07Circle extends Ex07Shape {
    private final double radius;

    public Ex07Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}