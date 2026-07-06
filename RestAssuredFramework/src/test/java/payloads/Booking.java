package payloads;

public class Booking {
    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private BookingDates bookingDates;
    private String additionalneeds;

    public Booking() {

    }

    public Booking(String firstname, String lastname, int totalprice, boolean depositpaid, BookingDates bookingDates,
            String additionalneeds) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.bookingDates = bookingDates;
        this.additionalneeds = additionalneeds;
    }

    public String getFirstName() {
       return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname=firstname;
    }

    public String getLastName() {
       return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname=lastname;
    }

    public int getTotalPrice() {
       return totalprice;
    }

    public void setTotalPrice(int totalprice) {
        this.totalprice=totalprice;
    }

    public boolean getDepositPaid() {
       return depositpaid;
    }

    public void setDepositPaid(boolean depositpaid) {
        this.depositpaid=depositpaid;
    }

    public BookingDates getBookingDates() {
       return bookingDates;
    }

    public void setBookingDates(BookingDates bookingDates) {
        this.bookingDates=bookingDates;
    }

    public String getAdditionalNeeds() {
       return additionalneeds;
    }

    public void setAdditionalNeeds(String additionalneeds) {
        this.additionalneeds=additionalneeds;
    }

}
