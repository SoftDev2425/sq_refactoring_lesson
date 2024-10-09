package org.example;

import java.util.*;

/*
What's Wrong:
    - No Design Patterns

Bad Design:
    - There's no separation of concerns.
    - Code readability is poor, and it’s prone to errors due to unsafe type casting.

Fix the code:

Hints:
    - Only design patterns covered so far is used.
    - There are more than one design pattern in play to solve this properly

Assignment:
    - Refactor the code!
    - Explain and argue for the used design patterns
*/


// COMMAND PATTERN
public class good_library {
    public static void main(String[] args) {
        Library<Book> library = Library.getInstance();

        library.addBook(BookFactory.createBook("The Great Gatsby", "F. Scott Fitzgerald", "fiction", "physical"));
        library.addBook(BookFactory.createBook("How to build a car", "Steven Ellebæk", "nonfiction", "physical"));
        library.addBook(BookFactory.createBook("The Da Vinci Code", "Dan Brown", "thriller", "physical"));
        library.addBook(BookFactory.createBook("Ebook Title", "Ebook Author", "nonfiction", "ebook"));
        library.addBook(BookFactory.createBook("Special Book", "Author", "Computer Science", "special"));

        Book bookTest = BookFactory.createBook("Test", "Test", "Test", "Test");

        Command addBook1 = new AddBookCommand(library, bookTest);
        addBook1.execute();

        for (Book book : library.getBooks()) {
            System.out.println("Title: " + book.getTitle() + "\n\t Author: " + book.getAuthor() + "\n\t Type: " + book.getType());
        }
    }
}