import java.util.Scanner;

public class FootballTeamHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        
        System.out.println("Enter heights of 11 football players (in cm):");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = scanner.nextDouble();
        }
        
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += heights[i];
        }
        
        double meanHeight = sum / 11;
        System.out.println("Mean height of the football team: " + meanHeight + " cm");
        
        scanner.close();
    }
} 