import java.util.Scanner;
public class ReplaceMethod {
    public static String replace(String str, char oldChar, char newChar) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == oldChar) {
                result += newChar;
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char oldChar = sc.nextLine().charAt(0);
        char newChar = sc.nextLine().charAt(0);
        System.out.println(replace(str, oldChar, newChar));
    }
} 