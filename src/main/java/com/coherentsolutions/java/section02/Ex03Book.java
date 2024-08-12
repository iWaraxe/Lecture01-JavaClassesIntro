package com.coherentsolutions.java.section02;

/**
 * Represents a book in a library system, demonstrating state management and behaviors of a regular class.
 */
public class Ex03Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    /**
     * Constructs a new book with specified title and author.
     *
     * @param title The title of the book.
     * @param author The author of the book.
     */
    public Ex03Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    /**
     * Marks the book as borrowed.
     */
    public void borrowBook() {
        isBorrowed = true;
    }

    /**
     * Marks the book as returned.
     */
    public void returnBook() {
        isBorrowed = false;
    }

    /**
     * Displays information about the book.
     */
    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author + ". Borrowed? " + isBorrowed);
    }

    /**
     * Main method to demonstrate the functionality of the Book class.
     */
    public static void main(String[] args) {
        Ex03Book myBook = new Ex03Book("Java Fundamentals", "John Doe");
        myBook.borrowBook();
        myBook.displayInfo();
        myBook.returnBook();
        myBook.displayInfo();
    }
}
