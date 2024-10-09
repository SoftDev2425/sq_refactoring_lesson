package org.example;

public class SpecialEditionBook extends Book {
    private Book book;

    SpecialEditionBook(Book book) {
        super(book.getTitle(), book.getAuthor(), book.getGenre());
        this.book = book;
    }

    @Override
    String getType() {
        return this.book.getType() + " (special edition)";
    }
}
