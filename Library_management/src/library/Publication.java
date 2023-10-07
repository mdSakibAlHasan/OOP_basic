package library;

import java.io.Serializable;

public class Publication extends Item implements Serializable {
    private String  publisherName;
    private boolean isJournalPaper;

    public Publication(String title, String category, String authors, int publishYear, String publisherName, boolean isJournalPaper) {
        super("22-",title, category, authors, publishYear);
        this.publisherName = publisherName;
        this.isJournalPaper = isJournalPaper;
    }

    @Override
    public String toString() {
        String message;
        if(isJournalPaper){
            message = super.toString()+" Journal-publisherName "+publisherName;
        }else {
            message = super.toString()+" Conference-publisherName "+publisherName;
        }

        return message;
    }
}
