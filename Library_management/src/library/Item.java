package library;

import customExceptio.CheckedOutException;

import java.io.Serializable;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;

public abstract class Item implements Serializable {
    private  boolean isCheckedOut;
    private String itemId, title, category, authors;
    private int publishYear;
    private ArrayList<CheckOutRecord> chekOutRecords = new ArrayList<>();

    public Item(String itemId,String title,String  category,String authors, int publishYear){
        this.title = title;
        this.category = category;
        this.authors = authors;
        this.publishYear = publishYear;
        this.itemId = itemId;

        Random random = new Random();
        String randomNumber = String.format("%04d", random.nextInt(10000));
        this.itemId += publishYear+"-"+randomNumber;
    }

    public void checkOut(String memberId) throws CheckedOutException{
        if(isCheckedOut){
            throw new CheckedOutException(category, title,  itemId);
        }
       isCheckedOut = true;
        CheckOutRecord checkOutRecordObject = new CheckOutRecord(memberId, itemId);
        chekOutRecords.add(checkOutRecordObject);
    }

    public void checkIn(){
        if(isCheckedOut){
            isCheckedOut = false;
            CheckOutRecord checkOutRecordObject = getLatestCheckOutRecords();
            checkOutRecordObject.returnItem();
        }
    }

    public void extendCheckOut() throws CheckedOutException{
        if(!isCheckedOut){
            throw new CheckedOutException(category, title,  itemId);
        }

        CheckOutRecord checkOutRecordObject = getLatestCheckOutRecords();
        long daysDifference = ChronoUnit.DAYS.between(checkOutRecordObject.getExpectedCheckInDate(),checkOutRecordObject.getCheckOutDate());
        if(daysDifference <= 14){
            checkOutRecordObject.setExpectedCheckInDate();
        }
        else {
            throw new CheckedOutException("Already extended once. Cannot extend again");
        }

    }

    public boolean isAnAuthor(String author){
        if(this.authors.contains(author)){
            return true;
        }
        else {
            return false;
        }
    }

    public CheckOutRecord getLatestCheckOutRecords(){
        return chekOutRecords.get(chekOutRecords.size()-1);
    }

    public String getItemId() {
        return itemId;
    }

    public String getAuthors() {
        return authors;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    @Override
    public String toString() {
        String msg =  "ID: "+itemId+ " - Title: "+title+" -Authos: "+authors+" - Year: "+publishYear+" - CheckedOut: "+isCheckedOut;
        return msg;
    }

    public ArrayList< CheckOutRecord > getCheckOutRecords(){
        return chekOutRecords;
    }

}
