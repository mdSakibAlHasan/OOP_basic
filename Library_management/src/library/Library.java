package library;

import customExceptio.CheckedOutException;
import customExceptio.InvalidItemException;
import customExceptio.InvalidMemberException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Library implements Serializable {
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    private void addItem(Item item){
        items.add(item);
    }

    public void addItem(String title, String category, String authors, int publishYear, String publisherName){
        Book book = new Book(title,category,authors,publishYear,publisherName);
        addItem(book);
    }

    public void addItem(String title, String category, String authors, int publishYear, boolean isJournal, String publisherName){
        Publication publication = new Publication(title,category,authors,publishYear,publisherName,isJournal);
        addItem(publication);
    }

    public void addItem(String title, String category, String directors, int releaseYear){
        Movie movie = new Movie(title,category,directors, releaseYear);
        addItem(movie);
    }

    private void addMember(Member member){
        members.add(member);
    }

    public void addMember(String memberId , String name){
        Member member = new Member(memberId,name);
        addMember(member);
    }


    public Item findItem(String itemId) throws InvalidItemException{
        for (Item item : items) {
            if (Objects.equals(item.getItemId(), itemId)) {
                return item;
            }
        }

        throw new InvalidItemException(itemId);
    }

    public ArrayList<Item> findItems(String itemTitle, String author){
        boolean isAuthor = author.length() > 0;
        ArrayList<Item> matchItem = new ArrayList<>();
        for (Item item : items) {
            if (item.getTitle().contains(itemTitle)) {
                if(isAuthor){
                    if(item.getAuthors().contains(author)){
                        matchItem.add(item);
                    }
                }else{
                    matchItem.add(item);
                }
            }
        }
        return matchItem;
    }

    public ArrayList<Item> findItems(String itemType){
        ArrayList<Item> matchItem = new ArrayList<>();
        for(Item item: items){

        }

        return matchItem;
    }

    public Member findMember(String memberID) throws InvalidMemberException{
        for(Member member: members){
            if(Objects.equals(member.memberId, memberID)){
                return member;
            }
        }
        throw new InvalidMemberException(memberID);
    }

    public void checkOut(String itemId, String memberId) throws CheckedOutException, InvalidItemException, InvalidMemberException{
        Item matchItem = findItem(itemId);
        Member matchMember = findMember(memberId);
        if(matchMember != null && matchItem!=null){
            matchItem.checkOut(memberId);
            CheckOutRecord checkOutItem =  matchItem.getLatestCheckOutRecords();
            matchMember.addCheckOutRecord(checkOutItem);
        }
    }

    public void extendCheckOut(String itemId) throws InvalidItemException, CheckedOutException {
        Item matchItem = findItem(itemId);
        matchItem.extendCheckOut();
    }

    public void checkIn(String itemId) throws InvalidItemException {
        Item matchItem = findItem(itemId);
        matchItem.checkIn();
    }

    public ArrayList<CheckOutRecord> getCheckOutRecords(String itemId) throws InvalidItemException {
        Item matchItem = findItem(itemId);
        return matchItem.getCheckOutRecords();
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
