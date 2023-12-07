
public class Ticket {
    public String ID;
    private int seatNumber;
    private String showtime;
    private double price;
    private Movie movie;

    public String getID() {
        return ID;
    }

    // Constructor
    public Ticket( int seatNumber, String showtime, double price,Movie movie) {
        this.seatNumber = seatNumber;
        this.showtime = showtime;
        this.price = price;
        this.movie = movie;

    }

    // Getter and Setter methods
    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    public Movie getMovie() {
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

