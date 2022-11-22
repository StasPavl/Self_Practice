package day24_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {

        public static void main(String[] args) {
            ArrayList<Character> list = new ArrayList<>();
            list.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
            list.removeIf(p-> Character.isLetter(p));
            System.out.println("list = " + list);
        }
    }
/*
Write a program that can remove all the letters from an arraylist of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}
		output:
		['$',  '1', '2', '@', '!', '3', '4']
 */

