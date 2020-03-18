package BookReaderApp;

public class Book {
    public String title;
    public enum publisher {MACMILLAN, PEARSON, PRINCETON, MAGOOSH, BARRON};
    public String description = "Description not given";
    public int numberOfPages;
    public int isbn;
    public String author = "Anonymous";

    public Book(String author, String title, String description, int numberOfPages, int isbn) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.isbn = isbn;
    }
    
    public Book(String author, String title, String description) {
        this.title = title;
        this.description = description;
        this.author = author;
    }

    public Book(String author, String title) {
        this.title = title;
        this.author = author;
    }

    public Book(String title) {
        this.title = title;
    }
}