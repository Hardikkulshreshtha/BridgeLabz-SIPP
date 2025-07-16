import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number (1-7) for day of the week:");
        System.out.println("1 - Monday");
        System.out.println("2 - Tuesday");
        System.out.println("3 - Wednesday");
        System.out.println("4 - Thursday");
        System.out.println("5 - Friday");
        System.out.println("6 - Saturday");
        System.out.println("7 - Sunday");
        
        System.out.print("Enter your choice: ");
        int day = sc.nextInt();
        
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day! Please enter a number between 1 and 7.");
        }
    }
}