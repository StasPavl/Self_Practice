package day09_tasks;

import java.util.Scanner;

public class CentsToDollar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter cents");
        int cents = input.nextInt();

        int leftCents = cents % 100;
        int dollars = cents / 100;

        System.out.println(cents + " cents equal to: " + dollars + " dollars and " + leftCents + " cents");
        input.close();
    }
}
