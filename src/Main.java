import java.util.List;

public class Main {
    public static void main(String[] args) {

        FileDeal fileDeal = new FileDeal();
        fileDeal.createNestedFolders("info");
        fileDeal.createFile("info","Ticketing.txt","ziad");

        User user = new User("ziad","12345678","aaaa");
        Movie movie = new Movie(1,"homes","comedy");
        Ticketing ticketing = new Ticketing();
        //User user, Movie movie, String showtime, String seatNumber
        String time = "20:20";
        String seatNumber  = "5A";

        String[] teckt ={"1",user.getUsername(), movie.getTitle(),time,seatNumber};
        ticketing.bookTicket(teckt);
        ticketing.bookTicket(teckt);

        ticketing.cancelTicket(teckt);

    }
}