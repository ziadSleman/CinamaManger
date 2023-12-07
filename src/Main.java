import java.util.List;
public class Main {
    public static void main(String[] args) {

        FileDeal fileDeal = new FileDeal();
        fileDeal.createNestedFolders("info");
        fileDeal.createFile("info","Ticketing.txt","ziad");

        User user = new User("ziad","12345678","aaaa");
        Movie movie = new Movie(1,"homes","comedy");
        //User user, Movie movie, String showtime, String seatNumber
        String time = "20:20";
        int seatNumber  = 5;

        Ticketing ticketing = new Ticketing(user,movie,time,seatNumber);


    }
}