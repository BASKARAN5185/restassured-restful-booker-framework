package payloads;

public class BookingDates {
   private String checkin;
   private String checkout;
   
   public BookingDates(String checkin,String checkout){
        this.checkin=checkin;
        this.checkout=checkout;
   }

   public void setCheckInDates(String checkin){
      this.checkin=checkin;
   }

   public String getCheckInDates(){
    return checkin;
   }


   public void setCheckOutDates(String checkout){
      this.checkout=checkout;
   }

   public String getCheckOutDates(){
    return checkout;
   }

}
