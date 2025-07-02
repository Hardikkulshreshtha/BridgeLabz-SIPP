import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        System.out.println("Date Arithmetic Calculator");
        System.out.println("==========================");
        
        System.out.print("Enter a date (yyyy-MM-dd format): ");
        String dateInput = scanner.nextLine();
        
        try {
            LocalDate inputDate = LocalDate.parse(dateInput, formatter);
            System.out.println("\nOriginal Date: " + inputDate.format(formatter));
            
            LocalDate result = inputDate
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);
            
            System.out.println("\nAfter adding 7 days, 1 month, and 2 years:");
            System.out.println("Then subtracting 3 weeks:");
            System.out.println("Result: " + result.format(formatter));
            
            System.out.println("\nStep-by-step calculation:");
            System.out.println("1. Original: " + inputDate.format(formatter));
            System.out.println("2. +7 days: " + inputDate.plusDays(7).format(formatter));
            System.out.println("3. +1 month: " + inputDate.plusDays(7).plusMonths(1).format(formatter));
            System.out.println("4. +2 years: " + inputDate.plusDays(7).plusMonths(1).plusYears(2).format(formatter));
            System.out.println("5. -3 weeks: " + result.format(formatter));
            
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid date in yyyy-MM-dd format.");
            System.out.println("Example: 2024-01-15");
        }
        
        scanner.close();
    }
} 