package library;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CheckOutRecord implements Serializable {
    private String memberId;
    private String itemId;
    private LocalDate checkOutDate, expectedCheckInDate, checkInDate;

    public CheckOutRecord(String memberId, String itemId){
        this.memberId = memberId;
        this.itemId = itemId;
        checkOutDate = LocalDate.now();
        expectedCheckInDate = checkOutDate.plusWeeks(2);
    }

    public void returnItem(){
        checkInDate = LocalDate.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String checkoutDateFormat = checkOutDate.format(formatter);
        String checkinDateFormat = checkInDate.format(formatter);

        String value = itemId+"\t"+memberId+"\t"+checkoutDateFormat+"\t"+checkinDateFormat;
        return value;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public LocalDate getExpectedCheckInDate() {
        return expectedCheckInDate;
    }

    public void setExpectedCheckInDate() {
        this.expectedCheckInDate = expectedCheckInDate.plusWeeks(1);
    }
}
