public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(30));
    }

    public static String countAndSay(int n) {
        int counter = 1;
        String output = "1";
        String str = "";
        char last = 'm';
        int charCount = 1;


        while(counter < n) {
            str = output;
            output = "";
            charCount = 1;
            for(int i = 0; i < str.length(); i++) {
                if(str == "1") {
                    output = "11";
                }

                if(i == 0) {
                    last = str.charAt(i);
                    continue;
                }

                if(str.charAt(i) == last) {
                    charCount++;
                }
                else {
                    output += charCount;
                    output += str.charAt(i - 1);
                    charCount = 1;
                    last = str.charAt(i);
                }

                if(i == str.length() - 1) {
                    output += charCount;
                    output += str.charAt(i);
                }
            }
            System.out.println(output);
            counter++;
        }

        return output;

    }
}
