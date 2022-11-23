package randomPractice;

import java.util.Arrays;

public class StringToIntArr {
    public static void main(String[] args) {
        String word = "word";

        String numbers = "1,2,3,4,5,6";
        String[] num = numbers.split(",");
        System.out.println(Arrays.toString(num));
        int[] intArr = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            intArr[i] = Integer.parseInt(num[i]);
        }
        System.out.println(Arrays.toString(intArr));
    }

}
/*
Convert String with numbers to Integer arr
 */
