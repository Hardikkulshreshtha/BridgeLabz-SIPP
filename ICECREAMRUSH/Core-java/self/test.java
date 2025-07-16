import java.util.Scanner;

// Count the number of words in the paragraph.
// Find and display the longest word.
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = a.length();

        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < b; i++) {
            if (a.charAt(i) != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        System.out.println("The number of words in the paragraph is = " + wordCount);

        int res = 0, curr_len = 0, endIndex = 0;
        for (int i = 0; i < b; i++) {
            if (a.charAt(i) != ' ') {
                curr_len++;
            } else {
                if (curr_len > res) {
                    res = curr_len;
                    endIndex = i;
                }
                curr_len = 0;
            }
        }
        if (curr_len > res) {
            res = curr_len;
            endIndex = b;
        }
        String longestWord = a.substring(endIndex - res, endIndex);
        System.out.println("The longest word is: " + longestWord);
        System.out.println("Length of the longest word is: " + res);
    }
}
