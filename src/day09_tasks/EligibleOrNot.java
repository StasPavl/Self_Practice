package day09_tasks;

import java.util.Scanner;

public class EligibleOrNot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        if (age>= 21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You not eligible to buy alcohol");
        }
        input.close();
    }
}
