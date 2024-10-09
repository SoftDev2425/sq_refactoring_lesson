package org.example;

public class EBook extends Book {
        EBook(String title, String author, String genre) {
            super(title, author, genre);
        }

        @Override
        String getType() {
            return "ebook";
        }
}