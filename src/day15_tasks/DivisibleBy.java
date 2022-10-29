package day15_tasks;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int userNum = input.nextInt();
        String by15 = "";
        String by3 = "";
        String by5 = "";

        for (int i = 1; i < userNum; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 15 == 0) {
                if (i % 5 == 0 && i % 15 != 0) {
                    by5 += " " + i;
                } else if (i % 3 == 0 && i % 15 != 0) {
                    by3 += " " + i;
                } else {
                    by15 += " " + i;
                }
            }
        }

        System.out.println("by3 = " + by3);
        System.out.println("by5 = " + by5);
        System.out.println("by15 = " + by15);
    }
}
