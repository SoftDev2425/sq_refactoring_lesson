package org.example;

public class PhysicalBook extends Book {
    PhysicalBook(String title, String author, String genre) {
        super(title, author, genre);

    }

    @Override
    public String getType() {
        return "paperbook";
    }
}
