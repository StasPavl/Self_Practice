package randomPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class SortWithOutCollections {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int[] arr = {2, 3, 1, 4, 6, 8};

        for (int each : arr) {
            list.add(each);
        }


        for (int i = 0; i < arr.length; i++) {


            int min = Integer.MAX_VALUE;

            for (int integer : arr) {
                if (integer == min) {
                    continue;
                }

                if (integer < min) {
                    min = integer;


                }


            }

            list2.add(min);
        }
        System.out.println(list2);

// NEED TO WORK ON IT!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        /*for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;*/

    }
}
/*
int [] arr = {2,3,1,4,5,8};
        int min = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i< min){
                min = i;
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            int temp = 0;
            if (arr[i]>= arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

            }
        }
        if (arr[0] !=min){
            arr[1] = arr[0];
            arr[0] = min;
        }
        System.out.println(Arrays.toString(arr));
    }
 */



