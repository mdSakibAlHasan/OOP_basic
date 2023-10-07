package library;

import java.io.Serializable;
import java.util.ArrayList;

public class Member implements Serializable {
    String memberId, name;
    ArrayList<CheckOutRecord> chekOutRecords  = new ArrayList<>();

    public Member(String memberId , String name){
        this.memberId = memberId;
        this.name = name;
    }

    public void addCheckOutRecord(CheckOutRecord record){
        chekOutRecords.add(record);
    }

}
