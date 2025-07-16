
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class string_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character,Integer> freq = new HashMap<>();
        String a = sc.nextLine();
        for (char n :  a.toCharArray()) {
            freq.put(n, freq.getOrDefault(n,0)+1);

            
        }
        System.out.println(freq);
    }
}
