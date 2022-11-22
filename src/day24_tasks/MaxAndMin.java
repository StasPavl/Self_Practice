package day24_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxAndMin {
    public static void main(String[] args) {
                ArrayList<Integer> list = new ArrayList<>();

                list.addAll(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

                list.removeAll(Arrays.asList(Collections.max(list)));
                int max = Collections.max(list);
                System.out.println("max = " + max);

                list.removeAll(Arrays.asList(Collections.min(list)));
                int min = Collections.min(list);
                System.out.println("min = " + min);



            }
        }
/*
Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}
		output:
			second maximum number is 7
			second minimum number is 1
 */

