public class Ticket {
    private int seatNumber;
    private String showtime;
    private double price;

    // Constructor
    public Ticket(int seatNumber, String showtime, double price) {
        this.seatNumber = seatNumber;
        this.showtime = showtime;
        this.price = price;
    }

    // Getter and Setter methods
    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
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

