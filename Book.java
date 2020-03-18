package BookReaderApp;

public class Book {
    public String title;
    public enum publisher {MACMILLAN, PEARSON, PRINCETON, MAGOOSH, BARRON};
    public String description;
    public int numberOfPages;
    public int isbn;
    public String author;

    public Book(String author, String title, String description, int numberOfPages, int isbn) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.isbn = isbn;
    }
}