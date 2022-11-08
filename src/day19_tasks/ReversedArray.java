package day19_tasks;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] array = {10,6,3,8,5};

        int[] reversedArray = new int[5];

        for (int i = array.length - 1; i >= 0; i--) {

            reversedArray[4-i] += array[i];

        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
/*
Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};
        output:
            reversedArray = {5,4,3,2,1};
 */

