import java.util.Arrays;

public class AnagramSolution {
    public static boolean isAnagram(String s, String t) {
        int[] letters = new int[26];

//        if(s.length() != t.length()) {
//            return false;
//        }

        for(int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }

        System.out.println(Arrays.toString(letters));



        return false;
    }

    public static void main(String[] args) {
        isAnagram("hello", "austin");
    }
}
