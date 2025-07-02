import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int numberOfPersons = scanner.nextInt();
        
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];
        
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height (cm): ");
            heights[i] = scanner.nextDouble();
            
            double heightInMeters = heights[i] / 100;
            bmis[i] = weights[i] / (heightInMeters * heightInMeters);
            
            if (bmis[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmis[i] < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmis[i] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        System.out.println("\nPerson\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println((i + 1) + "\t" + heights[i] + "\t\t" + weights[i] + "\t\t" + String.format("%.2f", bmis[i]) + "\t" + weightStatus[i]);
        }
        
        scanner.close();
    }
} 