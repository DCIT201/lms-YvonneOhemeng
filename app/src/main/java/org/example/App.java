package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();
        
        // Create some books
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        
        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        
        // Create a patron
        Patron patron = new Patron("Yvonne");
        
        // Register the patron
        library.registerPatron(patron);
        
        // Lend a book to the patron
        library.lendBook(book1, patron);
        
        // Print borrowed books
        System.out.println(patron.getName() + " borrowed: " + patron.getBorrowedBooks().get(0).getTitle());
    }
}