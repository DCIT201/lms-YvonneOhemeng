package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to register a patron
    public void registerPatron(Patron patron) {
        patrons.add(patron);
    }

    // Method to lend a book to a patron
    public boolean lendBook(Book book, Patron patron) {
        if (books.contains(book)) {
            patron.borrowBook(book);
            books.remove(book);
            return true;
        }
        return false; // Book not available
    }

    // Method to return a book from a patron
    public void returnBook(Book book, Patron patron) {
        patron.returnBook(book);
        books.add(book);
    }

    // Getters
    public List<Book> getBooks() {
        return books;
    }

    public List<Patron> getPatrons() {
        return patrons;
    }
}