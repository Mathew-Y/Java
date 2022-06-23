import java.util.Hashtable;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String sample = "pwwkew";

        System.out.println(lengthOfLongestSubstring(sample));
    }

    public static int lengthOfLongestSubstring(String s) {
        Hashtable<Character, Integer> charactersSeen = new Hashtable<>();
        int length = 0;

        for(int i = 0; i < s.length(); i++) {
            if(charactersSeen.containsKey(s.charAt(i))) {
                return length;
            }
            else {
                charactersSeen.put(s.charAt(i), 1);
                length++;
            }
        }
        return s.length();
    }
}

/*

 */
