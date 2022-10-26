package day14_tasks;

import static utilities.StringUtility.reverse;

public class Palindrome {


    public static void main(String[] args) {
        String text = "level";

        if (reverse(text).equals(text)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}



