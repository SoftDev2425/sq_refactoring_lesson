package org.example;

interface Command {
    void execute();
    void undo();
}

public class AddBookCommand implements Command {
    private final Library<Book> library;
    private final Book book;

    public AddBookCommand(Library<Book> library, Book book) {
        this.library = library;
        this.book = book;
    }

    @Override
    public void execute() {
        library.addBook(book);
    }

    @Override
    public void undo() {
        library.getBooks().remove(book);
    }
}
