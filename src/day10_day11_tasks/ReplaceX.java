package day10_day11_tasks;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter a word");
        String word = input.next();

        input.close();

         if (word.contains("x")){
             System.out.println("new word: " + word.replace("x", "a"));
         }

    }
}
