package inputOutput;

import java.io.Serializable;

public class Book implements Serializable {
    private String bookName,author, catagory;

    public Book(String bookName, String author, String catagory){
        this.bookName = bookName;
        this.author = author;
        this.catagory = catagory;
    }

    @Override
    public String toString() {
        return "Book name: "+bookName+" author: "+author+" catagory: "+catagory;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getCatagory() {
        return catagory;
    }
}
