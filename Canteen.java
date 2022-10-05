//the canteen will have a widtg, length and number of seats which students can use
                       //to dine inside it
public class Canteen extends Floor{ 
    private int width;
    private int length;
    private int seats;

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getSeats() {
        return this.seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

}