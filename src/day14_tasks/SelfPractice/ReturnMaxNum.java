package day14_tasks.SelfPractice;

import java.util.Scanner;

public class ReturnMaxNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNum = -2147483648;

        for (int i = 1; i <=5; i++) {
            System.out.println("Enter a number");
            int userNum = input.nextInt();

            if(userNum > maxNum){
                maxNum = userNum;
            }
        }

        System.out.println("Max NUmber is: "+ maxNum);
    }
}
