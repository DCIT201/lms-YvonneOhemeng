package org.example;

public class App {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Create some books
        Book book1 = new Book("1984", "George Orwell", 1949, "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "0987654321");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Create a patron
        Patron patron = new Patron("Alice");

        // Register the patron
        library.registerPatron(patron);

        // Lend a book to the patron
        library.lendBook(book1, patron);

            // Lend another book to the patron
        library.lendBook(book2, patron);

        // Attempt to lend a book that is already borrowed
        library.lendBook(book1, patron);

        // Display the current state of the library and the patron's borrowed books
        System.out.println(library);
        System.out.println(patron);

        // Return a book
        library.returnBook(book1, patron);

        // Attempt to return a book that was not borrowed
        library.returnBook(book1, patron);

        // Display the final state of the library and the patron's borrowed books
        System.out.println(library);
        System.out.println(patron);
    }
}
