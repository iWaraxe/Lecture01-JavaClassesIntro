### 2. **Regular Classes** (20 minutes)

#### 2.1 **Definition and Structure of a Regular Class** (5 minutes)
Let's begin by understanding what a regular class in Java is and its fundamental structure. A regular class is the most common type of class used in Java. It is a blueprint from which individual objects are created.

**Code Example:**
```java
// Example of a Regular Class in Java
public class Bicycle {
    // Fields, representing the state of the class
    private int gear;
    private int speed;

    // Constructor to initialize the Bicycle class
    public Bicycle(int startSpeed, int startGear) {
        gear = startGear;
        speed = startSpeed;
    }

    // Method to increase gear
    public void increaseGear() {
        gear++;
    }

    // Method to increase speed
    public void speedUp(int increment) {
        speed += increment;
    }
}
```

In this example, the `Bicycle` class has fields to store the state (`gear` and `speed`) and methods to modify these states. This is a fundamental example of encapsulation, where we keep the state of an object hidden from other objects, exposing only the functionalities.

#### 2.2 **Use Cases Where Regular Classes are Preferred Over Other Types** (7 minutes)
Regular classes are versatile and widely used in Java. They are particularly useful when you need to create objects that possess unique states and can have their behaviors modified.

**Discussion Points:**
- **Full Control Over Design:** Regular classes provide complete control over implementation, including how state is managed and how methods are exposed.
- **Extensibility:** They can be extended by other classes, unlike final classes or records, which are restrictive in that aspect.
- **Encapsulation:** Allows for strict encapsulation if required, unlike interfaces or abstract classes that cannot hold any concrete implementations.

**Code Demonstration:**
```java
// Example to demonstrate inheritance with regular classes
public class MountainBike extends Bicycle {
    // Additional field for MountainBike
    private int seatHeight;

    // Constructor for MountainBike class
    public MountainBike(int startHeight, int startSpeed, int startGear) {
        super(startSpeed, startGear);
        seatHeight = startHeight;
    }

    // Method to adjust seat height
    public void adjustSeatHeight(int adjustment) {
        seatHeight += adjustment;
    }
}
```

In this example, `MountainBike` extends `Bicycle`, illustrating how regular classes can be used to form a hierarchy and add more specific functionality (like `seatHeight`) to an already defined class.

#### 2.3 **Code Demonstration: Implementing a Regular Class** (8 minutes)
Now, let's code a regular class together. We'll implement a simple `Book` class, which will demonstrate how to encapsulate state and behavior in a regular class structure.

**Code Example:**
```java
// Implementing a regular class
public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    // Constructor to initialize the Book class
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false; // Default value
    }

    // Mark the book as borrowed
    public void borrowBook() {
        isBorrowed = true;
    }

    // Mark the book as returned
    public void returnBook() {
        isBorrowed = false;
    }

    // Display information about the book
    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author + ". Borrowed? " + isBorrowed);
    }
}
```
