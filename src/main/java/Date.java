import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now(); // Create a date object
        System.out.println(localDate); // Display the current date

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

        LocalDateTime myDateObj1 = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj1);
        DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate1 = myDateObj1.format(myFormatObj1);
        System.out.println("After formatting: " + formattedDate1);
    }
}
