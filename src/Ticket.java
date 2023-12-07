
public class Ticket {
    public String ID;
    private String seatNumber;
    private String showtime;
    private double price;
    private String movie;
    // Constructor
    public Ticket(String ID, String seatNumber, String showtime, double price,String movie) {
        this.seatNumber = seatNumber;
        this.showtime = showtime;
        this.price = price;
        this.movie = movie;
        this.ID = ID;
    }

    // Getter and Setter methods
    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public String getMovie() {
        return movie;
    }



    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Override toString method for better representation
    @Override
    public String toString() {
        return "Ticket{" +
                "seatNumber=" + seatNumber +
                ", showtime='" + showtime + '\'' +
                ", price=" + price +
                '}';
    }
}

