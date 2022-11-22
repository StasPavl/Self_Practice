package day24_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllDigits {
    public static void main(String[] args) {


                ArrayList<Character> list = new ArrayList<>();
                list.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
                list.removeIf(p-> Character.isDigit(p));
                System.out.println("list = " + list);
            }
        }
/*
Write a program that can remove all the digits from an arraylist of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}
		output:
			['$', A', 'B', 'C', 'D', '@', '!']
 */
