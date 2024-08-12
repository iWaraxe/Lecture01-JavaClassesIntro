### 3. **Enums (20 minutes)**

#### 3.1 **Explanation of Enums and Their Benefits** (5 minutes)
Let's begin by understanding what an enum (enumeration) is in Java and why it's beneficial. Enums provide a way to represent a fixed set of constants, which can be more type-safe than traditional constant values defined with `int` or `String`.

**Code Example:**
```java
// Enum to represent the days of the week
public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
```

**Discussion Points:**
- **Type Safety:** Enums ensure that the values are instances of the enum type itself, unlike constants which can be prone to type mismatches.
- **Namespace:** Enums help organize related constants under one type, improving code clarity.

#### 3.2 **Code Demonstration: Defining and Using Enums** (7 minutes)
Now, let's see how to define and use enums in a practical example, focusing on a scenario where enums can enhance readability and maintainability of code.

**Code Example:**
```java
// Enum to represent various states of a traffic light
public enum TrafficLight {
    RED, YELLOW, GREEN;
}

// Using enums in switch statements
public class TrafficControl {
    public void changeLight(TrafficLight light) {
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
        }
    }
}
```

**Live Coding**: Implement the `TrafficLight` enum and the `TrafficControl` class. Demonstrate changing traffic light states using the enum.

#### 3.3 **Discussing Enum-Specific Methods (values(), valueOf())** (8 minutes)
Enums in Java come with built-in methods that make them even more powerful. Let's explore the `values()` and `valueOf()` methods, which are extremely useful in dealing with enums.

**Code Example:**
```java
// Demonstrating enum-specific methods
public class EnumMethodsDemo {
    public static void printAllDays() {
        // values() returns an array of all enum constants
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }

    public static void checkDay(String str) {
        // valueOf() returns the enum constant of the specified string
        Day day = Day.valueOf(str);
        System.out.println("It's " + day);
    }
}

// Main method to run the demonstration
public static void main(String[] args) {
    EnumMethodsDemo.printAllDays();
    EnumMethodsDemo.checkDay("MONDAY");  // Adjust input as needed
}
```

**Live Coding**: Implemented the `EnumMethodsDemo` class and demonstrated how `values()` and `valueOf()` can manage and manipulate enum types dynamically.