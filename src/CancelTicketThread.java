public class CancelTicketThread extends Ticketing  implements Runnable{
    private User user;
    private Movie movie;
    private String showTime;
    private  int seatNumber;
    CancelTicketThread(User user, Movie movie, String showTime, int seatNumber){
        super(user, movie, showTime, seatNumber);
    }
    @Override
    public void run() {
<<<<<<< HEAD
      //  cancelTicket(user, seatNumber);
=======
        cancelTicket(user, seatNumber);
>>>>>>> origin/master

    }
}
