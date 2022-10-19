package day10_day11_tasks;

import java.util.Scanner;

public class WithOutFirstChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first word");
        String word1 = input.next();
        System.out.println("enter second word");
        String word2 = input.next();

        input.close();

        word1 = word1.substring(1);
        word2 = word2.substring(1);

        System.out.println(word1 + word2);
    }
}
