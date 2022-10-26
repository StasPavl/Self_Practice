package day14_tasks;

import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNum = input.nextInt();

        int facNum = 1;

        for (int i = userNum; i >1; i--) {
         facNum *= i;
        }

        System.out.println(facNum);
    }
}
