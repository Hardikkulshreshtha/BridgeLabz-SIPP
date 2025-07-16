import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        long tempNumber = number;
        int digitCount = 0;
        
        while (tempNumber != 0) {
            digitCount++;
            tempNumber /= 10;
        }
        
        int[] digits = new int[digitCount];
        tempNumber = number;
        
        for (int i = 0; i < digitCount; i++) {
            digits[i] = (int) (tempNumber % 10);
            tempNumber /= 10;
        }
        
        System.out.print("Reversed number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
        
        scanner.close();
    }
} 