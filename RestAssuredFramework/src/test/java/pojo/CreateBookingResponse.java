package pojo;

public class CreateBookingResponse {
    private int bookingid;
    private BookingDates bookingDates;

    public CreateBookingResponse() {

    }

    public CreateBookingResponse(int bookingid, BookingDates bookingDates) {
        this.bookingDates = bookingDates;
        this.bookingid = bookingid;
    }

    
    public int getBookingId() {
        return bookingid;
    }

    public void setBookingId(int bookingid) {
        this.bookingid=bookingid;
    }

    public BookingDates getBookingDates() {
        return bookingDates;
    }

    public void setBookingDates(BookingDates bookingDates) {
        this.bookingDates=bookingDates;
    }

}
