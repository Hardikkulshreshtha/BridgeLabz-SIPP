import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.printf("The distance is %.2f yards and %.2f miles%n", distanceInYards, distanceInMiles);
        input.close();
    }
}
