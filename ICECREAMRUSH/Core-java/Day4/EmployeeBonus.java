import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            
            System.out.print("Enter salary: ");
            double inputSalary = scanner.nextDouble();
            if (inputSalary <= 0) {
                System.out.println("Invalid salary. Please enter again.");
                i--;
                continue;
            }
            
            System.out.print("Enter years of service: ");
            int inputYears = scanner.nextInt();
            if (inputYears < 0) {
                System.out.println("Invalid years of service. Please enter again.");
                i--;
                continue;
            }
            
            salary[i] = inputSalary;
            yearsOfService[i] = inputYears;
            totalOldSalary += inputSalary;
        }
        
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }
        
        System.out.println("\nEmployee Details:");
        System.out.println("Employee\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t\t" + salary[i] + "\t\t" + yearsOfService[i] + "\t" + bonus[i] + "\t" + newSalary[i]);
        }
        
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        scanner.close();
    }
} 