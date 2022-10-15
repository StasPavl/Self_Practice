package day09_tasks;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number:");
        int num = input.nextInt();

        if(num > 0) {
            if (num % 2 == 0) {
                System.out.println("Your number is Even");
            } else {
                System.out.println("Your number is Odd");
            }
        } else if (num ==0) {
            System.out.println("your number is zero");

        }else{
            System.out.println("Your number is negative");
        }
        input.close();
    }
}
