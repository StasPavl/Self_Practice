package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        list.addAll(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));

        System.out.println(list);

    }
}
/*
write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};

                output:
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
