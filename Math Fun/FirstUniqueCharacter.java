import java.util.*;

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {
        Hashtable<Character, Integer> characters = new Hashtable<>();
        for(int i = 0; i < s.length(); i++) {
            if(characters.containsKey(s.charAt(i))) {
                characters.put(s.charAt(i), characters.get(s.charAt(i)) + 1);
            } else {
                characters.put(s.charAt(i), 1);
            }
        }

        System.out.println(characters.toString());

        for(int j = 0; j < s.length(); j++) {
            if(characters.get(s.charAt(j)) == 1) {
                return j;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
}
