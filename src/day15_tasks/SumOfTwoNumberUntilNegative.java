package day15_tasks;

import java.util.Scanner;

public class SumOfTwoNumberUntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        int sum = 0;
            sum = num1 + num2;
        System.out.println("Sum of two numbers: " + sum);


        while(num1 > 0 && num2 > 0){
            System.out.println("Enter first number");
             num1 = input.nextInt();
            System.out.println("Enter second number");
             num2 = input.nextInt();

             sum = num1 + num2;
            System.out.println("Sum of two numbers: " + sum);
        }

    }
}
