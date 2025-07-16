import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        double heightInches = heightCm / 2.54;
        int heightFeet = (int) (heightInches / 12);
        double remainingInches = heightInches % 12;
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f%n", heightCm, heightFeet,
                remainingInches);
        input.close();
    }
}
