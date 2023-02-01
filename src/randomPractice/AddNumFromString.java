package randomPractice;

import java.util.Arrays;

public class AddNumFromString {
    public static void main(String[] args) {
        String str = "12 hello world 1 3";
        //12+1+3
        String[] str1 = str.split(" ");
        System.out.println(Arrays.toString(str1));

        int result = 0;

        for (String each : str1) {
            try {

                result += Integer.parseInt(each);

            } catch (NumberFormatException e) {

            }
        }

        System.out.println(result);
    }
}
