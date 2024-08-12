package com.coherentsolutions.java.section04;

/**
 * A record representing a book with additional methods to enhance functionality.
 */
public record Ex03Book(String title, String author, int year) {

    /**
     * Provides a formatted detail string for the book.
     * @return Formatted string including title, author, and publication year.
     */
    public String getFormattedDetails() {
        return title + " by " + author + ", published in " + year;
    }

    /**
     * Main method to demonstrate the usage of the Book record.
     */
    public static void main(String[] args) {
        Ex03Book book = new Ex03Book("1984", "George Orwell", 1949);
        System.out.println(book);
        System.out.println("Details: " + book.getFormattedDetails());
    }
}
