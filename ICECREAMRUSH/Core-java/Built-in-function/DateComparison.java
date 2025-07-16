import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        System.out.println("Date Comparison Tool");
        System.out.println("====================");
        
        try {
            System.out.print("Enter first date (yyyy-MM-dd format): ");
            String date1Input = scanner.nextLine();
            LocalDate date1 = LocalDate.parse(date1Input, formatter);
            
            System.out.print("Enter second date (yyyy-MM-dd format): ");
            String date2Input = scanner.nextLine();
            LocalDate date2 = LocalDate.parse(date2Input, formatter);
            
            System.out.println("\nDate Comparison Results:");
            System.out.println("========================");
            System.out.println("First Date: " + date1.format(formatter));
            System.out.println("Second Date: " + date2.format(formatter));
            System.out.println();
            
            if (date1.isBefore(date2)) {
                System.out.println("Result: First date is BEFORE second date");
            } else if (date1.isAfter(date2)) {
                System.out.println("Result: First date is AFTER second date");
            } else if (date1.isEqual(date2)) {
                System.out.println("Result: Both dates are EQUAL");
            }
            
            System.out.println("\nDetailed Comparison:");
            System.out.println("====================");
            System.out.println("isBefore(): " + date1.isBefore(date2));
            System.out.println("isAfter(): " + date1.isAfter(date2));
            System.out.println("isEqual(): " + date1.isEqual(date2));
            
            long daysDifference = Math.abs(date1.toEpochDay() - date2.toEpochDay());
            System.out.println("Days difference: " + daysDifference + " days");
            
            if (!date1.isEqual(date2)) {
                LocalDate earlierDate = date1.isBefore(date2) ? date1 : date2;
                LocalDate laterDate = date1.isAfter(date2) ? date1 : date2;
                System.out.println("Earlier date: " + earlierDate.format(formatter));
                System.out.println("Later date: " + laterDate.format(formatter));
            }
            
        } catch (Exception e) {
            System.out.println("Error: Please enter valid dates in yyyy-MM-dd format.");
            System.out.println("Example: 2024-01-15");
        }
        
        scanner.close();
    }
} 