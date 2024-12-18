package org.example;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private List<Book> borrowedBooks;

    // Constructor
    public Patron(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Method to borrow a book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    // Method to return a book
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "Patron{" +
                "name='" + name + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}