import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();
        
        boolean isSpring = (month == 3 && day >= 20) || 
                          (month == 4) || 
                          (month == 5) || 
                          (month == 6 && day <= 20);
        
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        scanner.close();
    }
} 