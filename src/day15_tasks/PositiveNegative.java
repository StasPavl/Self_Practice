package day15_tasks;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positive = 0;
        int negative = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter your number");
            int userNum = input.nextInt();

            if (userNum > 0){
                positive ++;//positive += 1;
            }else{
                negative ++;
            }
        }
        System.out.println(positive + " positive and " + negative + " negative");
    }
}
