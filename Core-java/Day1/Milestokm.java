import java.util.Scanner;

public class Milestokm{
    public static void main(String[] args) {
        System.out.print("Enter the Km:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("The distance "+a+" km in miles is"+(a*1.6));
    }
}