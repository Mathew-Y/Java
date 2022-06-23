public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] dogs = {"acc", "aaa", "aaba"};
        System.out.println(longestCommonPrefix(dogs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String currentLongestPrefix = strs[0];
        int minimumLength = strs[0].length();;

        for(int i = 1; i < strs.length; i++) {
            System.out.println(currentLongestPrefix);
            if(currentLongestPrefix.equals("")) {
                return currentLongestPrefix;
            }

            if(strs[i].length() == 0) {
                return "";
            }

            minimumLength = Math.min(minimumLength, strs[i].length());

            for(int j = 0; j < minimumLength; j++) {
                if(currentLongestPrefix.charAt(j) != strs[i].charAt(j)) {
                    currentLongestPrefix = currentLongestPrefix.substring(0, j);
                    break;
                }

                if(j == strs[i].length() - 1) {
                    currentLongestPrefix = strs[i];
                }
            }
        }
        return currentLongestPrefix;
    }
}
