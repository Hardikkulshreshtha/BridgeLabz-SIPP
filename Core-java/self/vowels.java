public class vowels {
    public static void main(String[] args) {
        String input = "hello world";
        String result = removeVowels(input);
        System.out.println(result); 
    }

    public static String removeVowels(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!isVowel(ch)) {
                result += ch;
            }
        }
        return result;
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); 
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
