package day20_tasks;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String sentence = "I love Java";
        String reversed = "";
        String result = " ";

        String[] arr1 = sentence.split(" ");

        for (int i = 0; i < arr1.length; i++) {
            if (i == 1){
                for (int j = arr1[i].length()-1; j >= 0; j--) {
                    reversed+=arr1[i].charAt(j);
                }
                arr1[i]= reversed;
            }
            result += arr1[i] + " ";
        }

        System.out.println(result);
    }
}
