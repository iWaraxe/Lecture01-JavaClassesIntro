package com.coherentsolutions.java.section01.advanced;

/**
 * A generic class to demonstrate the usage of type parameters for achieving type safety and flexibility.
 */
public class Ex05Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Ex05Box<Integer> integerBox = new Ex05Box<>();
        integerBox.set(123);
        System.out.println("Box contains: " + integerBox.get());
    }
}
