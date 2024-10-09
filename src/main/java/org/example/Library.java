package org.example;
import java.util.ArrayList;
import java.util.List;

public class Library<T> {
    private static Library<Book> instance = null;
    List<T> books = new ArrayList<>();

    private Library() {}

    public static Library<Book> getInstance() {
        if(instance == null) instance = new Library<Book>();

        return instance;
    }

    void addBook(T book) {
        books.add(book);
    }

    List<T> getBooks() {
        return books;
    }
}
