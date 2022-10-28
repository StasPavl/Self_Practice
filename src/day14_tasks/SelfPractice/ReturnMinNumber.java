package day14_tasks.SelfPractice;

import java.util.Scanner;

public class ReturnMinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minNum = 2147483647;

        for (int i = 1; i <=5; i++){
            System.out.println("enter your number");
            int userNum = input.nextInt();

            if (userNum < minNum){
                minNum = userNum;
            }
        }
        input.close();

        System.out.println("minNum = " + minNum);

    }
}
