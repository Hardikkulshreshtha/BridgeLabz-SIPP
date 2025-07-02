import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        
        System.out.println("Current Date in Different Formats");
        System.out.println("=================================");
        System.out.println();
        
        System.out.println("Format 1 (dd/MM/yyyy): " + currentDate.format(formatter1));
        System.out.println("Format 2 (yyyy-MM-dd): " + currentDate.format(formatter2));
        System.out.println("Format 3 (EEE, MMM dd, yyyy): " + currentDate.format(formatter3));
        
        System.out.println("\nExamples with different dates:");
        System.out.println("===============================");
        
        LocalDate[] exampleDates = {
            LocalDate.of(2024, 1, 15),
            LocalDate.of(2024, 12, 25),
            LocalDate.of(2024, 6, 1)
        };
        
        for (LocalDate date : exampleDates) {
            System.out.println("\nDate: " + date);
            System.out.println("dd/MM/yyyy: " + date.format(formatter1));
            System.out.println("yyyy-MM-dd: " + date.format(formatter2));
            System.out.println("EEE, MMM dd, yyyy: " + date.format(formatter3));
        }
    }
} 