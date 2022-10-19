package day10_day11_tasks;

import java.util.Scanner;

public class ReallyNeverMind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");

        String word = input.next();
        input.close();

        if(word.endsWith("ly")){
            System.out.println("really??");
        }else{
            System.out.println("never mind");
        }
    }
}
