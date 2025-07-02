import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();

        double area = 0.5 * base * height;
        System.out.printf("The area of the triangle is %.2f square inches and %.2f square centimeters%n", area,
                area * 6.4516);
        input.close();
    }
}
