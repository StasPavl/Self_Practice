package day22_tasks;

import java.util.Arrays;

public class Swap {

        public static void main(String[] args) {
            int[]arr = {10, 20, 30, 40, 50,60,70,80,100};
            int[]new_arr = swap(arr,3,8);
            System.out.println(Arrays.toString(new_arr));
        }
        public static int[]swap(int[]arr, int indexOfI, int indexOfJ){
            int[] new_array = new int[arr.length];

            for (int i = 0; i < arr.length ; i++) {

                if (i < indexOfI) {
                    new_array[i] = arr[i];
                } else if (i == indexOfI) {
                    new_array[i] = arr[indexOfJ];
                } else {
                    new_array[i] = arr[i - 1];
                }
            }
            return new_array;
        }
        public static char[]swap(char[]arr, int indexOfI, int indexOfJ){
            char[] new_array = new char[arr.length];

            for (int i = 0; i < arr.length ; i++) {

                if (i < indexOfI) {
                    new_array[i] = arr[i];
                } else if (i == indexOfI) {
                    new_array[i] = arr[indexOfJ];
                } else {
                    new_array[i] = arr[i - 1];
                }
            }
            return new_array;
        }
        public static String[]swap(String[]arr, int indexOfI, int indexOfJ){
            String[] new_array = new String[arr.length];

            for (int i = 0; i < arr.length ; i++) {

                if (i < indexOfI) {
                    new_array[i] = arr[i];
                } else if (i == indexOfI) {
                    new_array[i] = arr[indexOfJ];
                } else {
                    new_array[i] = arr[i - 1];
                }
            }
            return new_array;
        }
        public static double[]swap(double[]arr, int indexOfI, int indexOfJ){
            double[] new_array = new double[arr.length];

            for (int i = 0; i < arr.length ; i++) {

                if (i < indexOfI) {
                    new_array[i] = arr[i];
                } else if (i == indexOfI) {
                    new_array[i] = arr[indexOfJ];
                } else {
                    new_array[i] = arr[i - 1];
                }
            }
            return new_array;
        }
    }

/*
Swap Task:
    2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j.
    the method swaps the element at index i with the element at index j, and returns the new array
            Ex:
                arr = {10, 20, 30, 40, 50};

                swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

    2.2 Create the same function for double array, char array and string array
 */

