package library;

public class Movie extends Item{
    private String directors;
    private int releaseYear;
    public Movie(String title, String category, String directors, int releaseYear) {
        super("33-",title, category, directors, releaseYear);
        this.directors = directors;
        this.releaseYear = releaseYear;
    }

    public String getDirectors() {
        return getAuthors();
    }

    public int getReleaseYear(){
        return getPublishYear();
    }
}
