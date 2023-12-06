import java.util.ArrayList;
import java.util.List;

public class Ticketing {
    private List<Ticket> bookedTickets;

    public Ticketing() {
        this.bookedTickets = new ArrayList<>();
    }

    // عرض المقاعد المتاحة
    public void displayAvailableSeats(Movie movie, String showtime) {
        System.out.println("Available seats for movie " + movie.getTitle() + " at showtime " + showtime + ":");

        // يمكنك تحسين هذا الجزء لعرض المقاعد المتاحة بشكل أفضل
        for (int i = 1; i <= 100; i++) {
            boolean isSeatBooked = isSeatBooked(movie, showtime, i);
            if (!isSeatBooked) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // حجز تذكرة
    public void bookTicket(User user, Movie movie, String showtime, int seatNumber) {
        if (!isSeatBooked(movie, showtime, seatNumber)) {
            double ticketPrice = calculateTicketPrice(movie);  // قد تحتاج لدعم طرق دفع مختلفة
            Ticket bookedTicket = new Ticket(seatNumber, showtime, ticketPrice);
            bookedTickets.add(bookedTicket);

            // يمكنك أيضًا تسجيل التذكرة في ملف نصي أو قاعدة بيانات
            System.out.println("Ticket booked successfully for " + user.getUsername() +
                    " - Seat Number: " + seatNumber +
                    ", Movie: " + movie.getTitle() +
                    ", Showtime: " + showtime +
                    ", Price: " + ticketPrice);
        } else {
            System.out.println("Seat " + seatNumber + " is already booked. Please choose another seat.");
        }
    }

    // إلغاء حجز تذكرة
    public void cancelTicket(User user, int seatNumber) {
        for (Ticket bookedTicket : bookedTickets) {
            if (bookedTicket.getSeatNumber() == seatNumber) {
                bookedTickets.remove(bookedTicket);

                // يمكنك أيضًا تحديث ملف السجل أو قاعدة البيانات
                System.out.println("Ticket canceled successfully for " + user.getUsername() +
                        " - Seat Number: " + seatNumber);
                return;
            }
        }
        System.out.println("No booking found for seat " + seatNumber + ". Please check the seat number.");
    }

    // تحقق ما إذا كانت التذكرة قد تم حجزها بالفعل
    private boolean isSeatBooked(Movie movie, String showtime, int seatNumber) {
        for (Ticket bookedTicket : bookedTickets) {
            if (bookedTicket.getSeatNumber() == seatNumber && bookedTicket.getShowtime().equals(showtime)) {
                return true;
            }
        }
        return false;
    }

    // احتساب سعر التذكرة (يمكن تعديله وفقًا لمتطلبات المشروع)
    private double calculateTicketPrice(Movie movie) {
        // قد تحتاج إلى تحسين هذا الجزء وفقًا لسياسات التسعير الخاصة بك
        return 10.0;  // على سبيل المثال، سعر التذكرة هنا هو 10 دولار
    }
}

