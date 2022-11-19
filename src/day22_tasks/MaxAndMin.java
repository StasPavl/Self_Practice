package day22_tasks;

import java.util.ArrayList;

public class MaxAndMin {

        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();

            list.add(17);//0
            list.add(32);//1
            list.add(31);
            list.add(40);
            list.add(5);

            System.out.println(list);

            int max = list.get(3);//40
            int min = list.get(3);//5

            for (Integer each : list) {
                //       40
                if (each > max) {
                    max = each;//8
                }
            }
            for (Integer each : list) {
                //       5
                if (each < min){
                    min = each;
                }
            }

            System.out.println("min = " + min);
            System.out.println("max = " + max);
        }
    }
/*
Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1
 */

