package org.example;

// Factory Method til at oprette bøger
public class BookFactory {
    public static Book createBook(String title, String author, String genre, String type) {
        return switch (type.toLowerCase()) {
            case "ebook" -> new EBook(title, author, genre);
            case "physical" -> new PhysicalBook(title, author, genre);
            case "special" -> new SpecialEditionBook(new PhysicalBook(title, author, genre));
            default -> throw new IllegalArgumentException("Invalid book type: " + type);
        };
    }
}
