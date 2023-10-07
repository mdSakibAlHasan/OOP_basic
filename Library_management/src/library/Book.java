package library;

public class Book extends Item{
    private String publisherName;
    public Book(String title, String category, String authors, int publishYear, String publisherName) {
        super("11-",title, category, authors, publishYear);
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return super.toString()+"  - Publisher:  "+publisherName;
    }
}
