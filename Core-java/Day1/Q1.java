import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the student fee: ");
        double fee = input.nextDouble();
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = input.nextDouble();
        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
