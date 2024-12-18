package org.example;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private String bookISBN;

    // Constructor
    public Book(String title, String author, int yearPublished, String bookISBN) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.bookISBN = bookISBN;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", bookISBN='" + bookISBN + '\'' +
                '}';
    }
}
