import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        double[] physicsMarks = new double[numberOfStudents];
        double[] chemistryMarks = new double[numberOfStudents];
        double[] mathsMarks = new double[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            
            System.out.print("Enter Physics marks: ");
            double physics = scanner.nextDouble();
            if (physics < 0) {
                System.out.println("Invalid marks. Please enter positive value.");
                i--;
                continue;
            }
            
            System.out.print("Enter Chemistry marks: ");
            double chemistry = scanner.nextDouble();
            if (chemistry < 0) {
                System.out.println("Invalid marks. Please enter positive value.");
                i--;
                continue;
            }
            
            System.out.print("Enter Maths marks: ");
            double maths = scanner.nextDouble();
            if (maths < 0) {
                System.out.println("Invalid marks. Please enter positive value.");
                i--;
                continue;
            }
            
            physicsMarks[i] = physics;
            chemistryMarks[i] = chemistry;
            mathsMarks[i] = maths;
            
            percentages[i] = (physics + chemistry + maths) / 3;
            
            if (percentages[i] >= 90) {
                grades[i] = "A+";
            } else if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println((i + 1) + "\t" + physicsMarks[i] + "\t" + chemistryMarks[i] + "\t\t" + mathsMarks[i] + "\t" + String.format("%.2f", percentages[i]) + "\t\t" + grades[i]);
        }
        
        scanner.close();
    }
} 