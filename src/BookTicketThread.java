import java.awt.print.Book;
import java.util.*;

public class BookTicketThread  extends Ticketing  implements Runnable{

    private User user;
    private Movie movie;
    private String showTime;
    private  int seatNumber;
    BookTicketThread(User user, Movie movie, String showTime, int seatNumber){
        super(user, movie, showTime, seatNumber);
    }
    @Override
    public void run() {
        bookTicket(user, movie, showTime, seatNumber);

    }
}
