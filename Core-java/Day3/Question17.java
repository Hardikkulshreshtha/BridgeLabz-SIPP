import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter years of service: ");
        int years = scanner.nextInt();
        
        double bonus = 0;
        if (years > 5) {
            bonus = salary * 0.05;
        }
        
        System.out.println("Bonus amount: " + bonus);
        scanner.close();
    }
} 