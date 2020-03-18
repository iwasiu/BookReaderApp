package BookReaderApp;

public class Book {
    String title ;
    enum publisher {MACMILLAN, PEARSON, PRINCETON,MAGOOSH,BARRON} ;
    enum subtitle {ENGLISH, FRENCH, LATIN, SWAHILI, HAUSA, ARABIC} ;
    String abstractstmt ;
    enum scope {ADVENTURE, SCIENTIFIC, POLITICAL} ;
    String edition ;
    int numberOfPages ;
    enum FormatText {TIMES_NEW_ROMAN, COMIC_SANS, ARIAL} ;
    String copyrightHolder ;
    Date dateCreated ; 
    int isbn ;
    String author ;
        public Book(String title, String abstractstmt, String edition, int numberOfPages, String copyrightHolder, int isbn, String author){
             this.title = title; 
             this.abstractstmt = abstractstmt; 
             this.edition = edition;
             this.numberOfPages = numberOfPages;
             this.copyrightHolder = copyrightHolder; 
             this.isbn = isbn; 
             this.author = author;
        }
    public addBookLibrary(){

        
    }
}