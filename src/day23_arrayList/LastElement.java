package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class LastElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        lastElementToZero(list);
        System.out.println(list);
    }
        public static ArrayList<Integer> lastElementToZero(ArrayList<Integer> arr){
        arr.set(arr.size()-1, 0 );
        return arr;

        }

    }

/*
write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,0];

 */
