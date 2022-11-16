package day22_tasks;

import java.util.Arrays;

public class Replace {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int[] new_arr = replace(arr, 3, 8);
            System.out.println(Arrays.toString(new_arr));


        }
        public static int[] replace(int[]arr, int indexOf, int newElement){
            for (int i = 0; i < arr.length; i++) {
                if (i == indexOf){
                    arr[i] = newElement;
                }
            }
            return arr;
        }
        public static char[] replace(char[]arr, int indexOf, char newElement){
            for (int i = 0; i < arr.length; i++) {
                if (i == indexOf){
                    arr[i] = newElement;
                }
            }
            return arr;
        }
        public static double[] replace(double[]arr, int indexOf, double newElement){
            for (int i = 0; i < arr.length; i++) {
                if (i == indexOf){
                    arr[i] = newElement;
                }
            }
            return arr;
        }
        public static String[] replace(String[]arr, int indexOf, String newElement){
            for (int i = 0; i < arr.length; i++) {
                if (i == indexOf){
                    arr[i] = newElement;
                }
            }
            return arr;
        }
    }
/*
Replace Task:
        1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


        1.2 Create the same functions for double arrays, char arrays, and String arrays
 */

