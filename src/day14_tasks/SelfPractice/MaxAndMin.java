package day14_tasks.SelfPractice;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = -2147483648;
        int min = 2147483647;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("enter your number");
            int userNumber = input.nextInt();

            if(userNumber >max){
                max = userNumber;
            }

            if (userNumber< min){
                min = userNumber;
            }

        }
        input.close();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
