package day22_tasks;

import java.util.ArrayList;

public class CombineString {

        public static void main(String[] args) {
            String[] arr1 = {"A", "B", "C"};
            String[] arr2 = {"D", "E", "F", "G"};
            ArrayList<String> list = new ArrayList<>();

            for (String each : arr1) {
                list.add(each);
            }
            for (String each : arr2) {
                list.add(each);
            }
            System.out.println(list);
        }
    }
/*
write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */

