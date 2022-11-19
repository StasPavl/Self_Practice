package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        System.out.println(largestNum(list,5));

    }
    public static int largestNum (ArrayList<Integer> arrayList, int n){
        int max = arrayList.indexOf(0);
        for (int i = 0; i < n; i++) {
            max = Collections.max(Arrays.asList(i));
        }
        return max;

    }

}
/*
write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */
