import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ticketing {
    private List<Ticket> bookedTickets;

    public Ticketing() {
        this.bookedTickets = new ArrayList<>();
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
    public void bookTicket(String[] info) {
        if (!isSeatBooked(info[0],info[2],info[3])) {
          //  double ticketPrice = calculateTicketPrice(movie);
            Ticket bookedTicket = new Ticket(info[0],info[3],info[2],100.5,info[2]);
                bookedTickets.add(bookedTicket);
            try (FileDeal writer = new FileDeal()) {
                String string = "Movie: " + info[0] + ", Showtime: " + bookedTicket.getShowtime() + ", Seat: " + bookedTicket.getSeatNumber();
                String previousContent = writer.readFile("\\info\\booking_log.txt");
                String newContent = (previousContent == null) ? string : previousContent + "\n" + string;

                writer.createFile("\\info", "booking_log.txt", string);
            } catch (Exception e) {
               e.printStackTrace();
            }
        } else {
            System.out.println("Seat " + info[4] + " is already booked. Please choose another seat.");
        }

    }
    public void cancelTicket(String[] teckt) {
        try (FileDeal reader = new FileDeal(); FileDeal writer = new FileDeal()) {
            String content = reader.readFile("\\info\\booking_log.txt");
            StringBuilder newContent = new StringBuilder();
            String[] lines = content.split("\n");
            for (String line : lines) {
                if (!line.contains("Seat: " + teckt[0])) {
                    newContent.append(line).append("\n");
                }
            }

            writer.createFile("\\info", "booking_log.txt", newContent.toString());

            Iterator<Ticket> iterator = bookedTickets.iterator();
            while (iterator.hasNext()) {
                Ticket bookedTicket = iterator.next();
                if (bookedTicket.getSeatNumber().equals(teckt[4])) {
                    iterator.remove();
                    break;
                }
            }

            System.out.println("Booking canceled for seat " + teckt[4]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // public void cancelTicket(User user,String seatNumber) {
 //       for (Ticket bookedTicket : bookedTickets) {
            //if (bookedTicket.getSeatNumber() == seatNumber) {
          //      bookedTickets.remove(bookedTicket);
        //        return;
      //          ..     }
     //   }
   //     System.out.println("No booking found for seat " + seatNumber + ". Please check the seat number.");
  //  }
    private boolean isSeatBooked(String movie, String showtime, String seatNumber) {
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

