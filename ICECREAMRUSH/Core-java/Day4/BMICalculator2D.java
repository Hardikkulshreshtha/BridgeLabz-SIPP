import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int numberOfPersons = scanner.nextInt();
        
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];
        
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            
            System.out.print("Enter weight (kg): ");
            double weight = scanner.nextDouble();
            if (weight <= 0) {
                System.out.println("Invalid weight. Please enter positive value.");
                i--;
                continue;
            }
            
            System.out.print("Enter height (cm): ");
            double height = scanner.nextDouble();
            if (height <= 0) {
                System.out.println("Invalid height. Please enter positive value.");
                i--;
                continue;
            }
            
            personData[i][0] = weight;
            personData[i][1] = height;
            
            double heightInMeters = height / 100;
            personData[i][2] = weight / (heightInMeters * heightInMeters);
            
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        System.out.println("\nPerson\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println((i + 1) + "\t" + personData[i][1] + "\t\t" + personData[i][0] + "\t\t" + String.format("%.2f", personData[i][2]) + "\t" + weightStatus[i]);
        }
        
        scanner.close();
    }
} 