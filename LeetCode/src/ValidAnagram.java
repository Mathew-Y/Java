import java.util.Hashtable;

public class ValidAnagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("ab", "a"));
    }

    public static boolean isAnagram(String s, String t) {
        Hashtable<Character, Integer> charFrequencies = new Hashtable<>();

        for(int i = 0; i < s.length(); i++) {
            if(charFrequencies.containsKey(s.charAt(i))) {
                charFrequencies.put(s.charAt(i), charFrequencies.get(s.charAt(i)) + 1);
            }
            else {
                charFrequencies.put(s.charAt(i), 1);
            }
        }

        for(int i = 0; i < t.length(); i++) {
            if(!charFrequencies.containsKey(t.charAt(i))) {
                return false;
            }
            else {
                charFrequencies.put(t.charAt(i), charFrequencies.get(t.charAt(i)) - 1);
                if(charFrequencies.get(t.charAt(i)) == 0) {
                    charFrequencies.remove(t.charAt(i));
                }
            }
        }

        if(charFrequencies.isEmpty()) {
            return true;
        }

        return false;
    }
}
