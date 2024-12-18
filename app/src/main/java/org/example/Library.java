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

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to register a patron
    public void registerPatron(Patron patron) {
        patrons.add(patron);
    }

    // Method to lend a book to a patron
    public void lendBook(Book book, Patron patron) {
        if (books.contains(book) && !patron.getBorrowedBooks().contains(book)) {
            patron.borrowBook(book);
            System.out.println(patron.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book is not available or already borrowed by " + patron.getName());
        }
    }

    // Method to return a book from a patron
    public void returnBook(Book book, Patron patron) {
        if (patron.getBorrowedBooks().contains(book)) {
            patron.returnBook(book);
            System.out.println(patron.getName() + " returned " + book.getTitle());
        } else {
            System.out.println(patron.getName() + " did not borrow " + book.getTitle());
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", patrons=" + patrons +
                '}';
    }
}