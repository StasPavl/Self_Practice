package day15_tasks;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;
        int result = 0;

        while( number >=0 ){
            System.out.println("Enter your number");
            number = input.nextInt();
            result +=number;
        }
        System.out.println("Sum of your numbers: "+ result);
    }
}
