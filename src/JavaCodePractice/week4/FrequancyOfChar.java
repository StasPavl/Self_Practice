package JavaCodePractice.week4;

import java.util.Arrays;
import java.util.Collections;

public class FrequancyOfChar {
    public static void main(String[] args) {

        String str = "AAABBCDD";
        System.out.println(FreqOfChar2(str));

        System.out.println(FreqOfChar1(str));

    }

    public static String FreqOfChar2(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            if (!result.contains("" + str.charAt(i))) {

                result += "" + str.charAt(i) + count;
            }

        }
        return result;
    }


    public static String FreqOfChar1(String str) {
        String result = "";
        String[] arr = str.split("");

        for (String each : arr) {
            if (!result.contains(each)) {
                result += each + Collections.frequency(Arrays.asList(arr), each);
            }
        }

        return result;
    }

}

/*
input str = "AAABBCDD"
otput str = A3B2C1D2
 */
