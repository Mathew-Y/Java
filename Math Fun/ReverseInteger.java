import java.util.Arrays;

public class ReverseInteger {

    public static int reverse(int x) {

        boolean isNegativeNumber = false;
        String stringVersion = Integer.toString(x);

        if (stringVersion.charAt(0) == '-') {
            stringVersion = stringVersion.substring(1);
            isNegativeNumber = true;
        }

        while (stringVersion.charAt(0) == 0) {
            stringVersion = stringVersion.substring(1);
        }

        char[] number = stringVersion.toCharArray();


        for (int i = 0; i <= (stringVersion.length() / 2) - 1; i++) {

            char temp = number[stringVersion.length() - 1 - i];

            number[stringVersion.length() - 1 - i] = stringVersion.charAt(i);

            number[i] = temp;

        }

        stringVersion = "";

        for (int i = 0; i < number.length; i++) {
            stringVersion += number[i];
        }

//        System.out.println(stringVersion);

        while (stringVersion.charAt(0) == 0) {
            stringVersion = stringVersion.substring(1);
        }

        if (isNegativeNumber) {
            stringVersion = "-" + stringVersion;
        }

        if(Long.parseLong(stringVersion) >= Integer.MAX_VALUE || Long.parseLong(stringVersion) <= Integer.MIN_VALUE) {
            return 0;
        }
        else {
            return Integer.parseInt(stringVersion);
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
