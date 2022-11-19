package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveAllZeros {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        int countZero = Collections.frequency(list,0);// counting how many o do we have in Array List

        list.removeAll(Arrays.asList(0));// removing all 0 from our Array List

        for (int i = 0; i < countZero; i++) {
            list.add(0);//adding 0 to our Array List with out 0
        }
        System.out.println(list);

       /* int[] arr = new int[list.size()];
        list.removeAll(Arrays.asList(0));

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }*/
    }
}
/*
Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]
 */
