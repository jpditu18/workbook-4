import java.time.DayOfWeek;
import java.time.LocalDate;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    //create derived method
    public double getPrice(){
       return this.getRoomType().equalsIgnoreCase("king")? 139.00 : 124.00;
    }
    public double getReservationTotal(){
        double total = this.getNumberOfNights() * this.getPrice();
        if (this.isWeekend()){
            total = total + (total * .1);
        }
        return total;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
}

