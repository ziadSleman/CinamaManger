import java.util.List;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\hp\\Desktop\\booked_tickets.txt";
        String fileContent = FileDeal.readFile(filePath);
        System.out.println("File Content :\n" + fileContent);

    }
}