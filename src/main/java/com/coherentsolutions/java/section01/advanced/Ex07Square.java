package com.coherentsolutions.java.section01.advanced;

public non-sealed class Ex07Square extends Ex07Shape {
    private final double side;

    public Ex07Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}