package day43_generics;

import java.util.Arrays;

public class ExchangeTwoNum {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4};
        a = swap(a,0,2);
        System.out.println(Arrays.toString(a));

    }
    public static <T> T[] swap (T[] arr , int index1, int index2){
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr;

    }
}

/*
Write a generic method to exchange the positions of two different elements in
array.

Integer[] a = {1,2,3,4};
swap(a,0,2);
System.out.println(Arrays.toString(a));
 */
