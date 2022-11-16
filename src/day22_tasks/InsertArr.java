package day22_tasks;

import java.util.Arrays;

public class InsertArr {

        public static void main(String[] args) {
            int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};
            int[] new_arr = insert(arr,5,100);
            System.out.println(Arrays.toString(new_arr));
        }

        public static int[] insert(int[] arr, int indexOf, int element) {


            int[] new_array = new int[arr.length + 1];

            for (int i = 0; i < arr.length + 1; i++) {

                if (i < indexOf) {
                    new_array[i] = arr[i];
                } else if (i == indexOf) {
                    new_array[i] = element;
                } else {
                    new_array[i] = arr[i - 1];
                }
            }
            return new_array;
        }
        public static double[] insert(double[] arr, int indexOf, double element) {


            double[] new_array = new double[arr.length + 1];

            for (int i = 0; i < arr.length + 1; i++) {

                if (i < indexOf) {
                    new_array[i] = arr[i];
                } else if (i == indexOf) {
                    new_array[i] = element;
                } else {
                    new_array[i] = arr[i - 1];
                }
            }
            return new_array;
        }
        public static char[] insert(char[] arr, int indexOf, char element) {


            char[] new_array = new char[arr.length + 1];

            for (int i = 0; i < arr.length + 1; i++) {

                if (i < indexOf) {
                    new_array[i] = arr[i];
                } else if (i == indexOf) {
                    new_array[i] = element;
                } else {
                    new_array[i] = arr[i - 1];
                }
            }
            return new_array;
        }
        public static String[] insert(String[] arr, int indexOf, String element) {


            String[] new_array = new String[arr.length + 1];

            for (int i = 0; i < arr.length + 1; i++) {

                if (i < indexOf) {
                    new_array[i] = arr[i];
                } else if (i == indexOf) {
                    new_array[i] = element;
                } else {
                    new_array[i] = arr[i - 1];
                }
            }
            return new_array;
        }

    }


/*
Insert Task:
        1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
        the method inserts the given element to the given index of the array and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


        1.2 Create the same function for double array, char array and string array
 */

