import java.util.Locale;

public class ValidPalindrome {

    public static void main(String[] args) {
        String sample = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(sample));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");


        for(int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i) == s.charAt(s.length() - i - 1)) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
