package com.coherentsolutions.java.section01.advanced;

import java.util.Arrays;
import java.util.List;

/**
 * A class to demonstrate the use of lambda expressions for functional programming aspects.
 */
public class Ex06LambdaDemo {
    public static void executeFunctionally() {
        List<String> items = Arrays.asList("Apple", "Banana", "Cherry");
        items.forEach(item -> System.out.println(item));
    }

    public static void main(String[] args) {
        executeFunctionally();
    }
}
