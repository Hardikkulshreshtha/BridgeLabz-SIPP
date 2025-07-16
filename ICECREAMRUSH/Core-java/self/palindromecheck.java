
import java.util.Scanner;

public class palindromecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int i = 0;
        int j = a.length()-1;
        boolean ispalendrome = true;
        
        while (i < j ){
            if(a.charAt(i) != a.charAt(j)){
                ispalendrome = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(ispalendrome);
    }
}
