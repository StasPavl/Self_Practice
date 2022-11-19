package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateChar {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();
        char[] eachCh = str.toCharArray();


        for (char ch : eachCh) {
            if (!Character.isLetterOrDigit(ch)){
                special.add(ch);
            } else if (Character.isDigit(ch)) {
                digits.add(ch);
            }else{
                letters.add(ch);
            }
        }
        System.out.println("special = " + special);
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);





    }
}
/*
Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */
