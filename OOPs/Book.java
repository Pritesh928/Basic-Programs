import java.util.*;
public class Book{
    static int totalnoofbooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;
    static{
        totalnoofbooks = 0;
    }
    {
        totalnoofbooks++;

    }
    Book(String title,String author,String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }

    static int gettotalbooks(){
        return totalnoofbooks;
    }

    void borrowbook(){
        if(isBorrowed){
            System.out.println("Enjoy the book");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }
    void returnbook(){
        if(isBorrowed){
            System.out.println("Thanks, Hope you enjoyed");
        }else{
            System.out.println("The book is already in library");
        }
    }
    public static void main(String[] args) {
        Book animators = new Book("animators","prit","1");
        Book nas = new Book("2");
        System.out.println(Book.gettotalbooks());
        animators.borrowbook();
        animators.returnbook();
        nas.borrowbook();
        nas.returnbook();
    }

}