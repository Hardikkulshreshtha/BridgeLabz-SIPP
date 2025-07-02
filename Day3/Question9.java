import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer");
            return;
        }
        
        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }
        
        int sumFormula = n * (n + 1) / 2;
        
        System.out.println("Sum using loop: " + sumLoop);
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Results match: " + (sumLoop == sumFormula));
        scanner.close();
    }
} 