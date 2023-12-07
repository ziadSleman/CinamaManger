import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ticketing {
    private List<Ticket> bookedTickets;
    private User user;
    private Movie movie;
    private String showTime;
    private  int seatNumber;

    public Ticketing(User user, Movie movie, String showTime, int seatNumber) {
        this.bookedTickets = new ArrayList<>();
        this.user = user;
        this.showTime = showTime;
        this.movie = movie;
        this.seatNumber = seatNumber;
    }

    // عرض المقاعد المتاحة
//    public void displayAvailableSeats(Movie movie, String showtime) {
//        System.out.println("Available seats for movie " + movie.getTitle() + " at showtime " + showtime + ":");
//        for (int i = 1; i <= 100; i++) {
//            boolean isSeatBooked = isSeatBooked(movie, showtime, i);
//            if (!isSeatBooked) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//    }

    // حجز تذكرة
    public void bookTicket(User user,Movie movie,String showTime,int seatNumber) {
        if (!isSeatBooked(movie,showTime,seatNumber)) {
          //  double ticketPrice = calculateTicketPrice(movie);
            Ticket bookedTicket = new Ticket(seatNumber,showTime,520,movie);
                bookedTickets.add(bookedTicket);
            try (FileDeal writer = new FileDeal()) {
                String string = "Movie: " + movie + ", Showtime: " + bookedTicket.getShowtime() + ", Seat: " + bookedTicket.getSeatNumber();
                String previousContent = writer.readFile("\\info\\booking_log.txt");
                String newContent = (previousContent == null) ? string : previousContent + "\n" + string;

                writer.createFile("\\info", "booking_log.txt", string);
            } catch (Exception e) {
               e.printStackTrace();
            }
        } else {
            System.out.println("Seat " + seatNumber + " is already booked. Please choose another seat.");
        }

    }
    public void cancelTicket(String[] info) {
        List<Ticket> newBookedTickets = new ArrayList<>();
        for (Ticket ticket : bookedTickets) {
            if (ticket.getID().equals(info[0])) {
                continue;
            }
            newBookedTickets.add(ticket);
        }
        bookedTickets = newBookedTickets;

        try (FileDeal writer = new FileDeal()) {
            String string = "Movie: " + bookedTickets+ ", Showtime: " + bookedTickets+ ", Seat: " + bookedTickets;
            String previousContent = writer.readFile("\\info\\booking_log.txt");
            String newContent = (previousContent == null) ? string : previousContent + "\n" + string;

            writer.createFile("\\info", "booking_log.txt", string);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    private boolean isSeatBooked(Movie movie, String showtime, int seatNumber) {
        for (Ticket bookedTicket : bookedTickets) {
            if (bookedTicket.getSeatNumber() == seatNumber && bookedTicket.getShowtime().equals(showtime)) {
                return true;
            }
        }
        return false;
    }
    private double calculateTicketPrice(Movie movie) {
        return 10.0;
    }
}

