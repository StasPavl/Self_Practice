package day09_tasks;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your miles: ");
        double miles = input.nextDouble();

        double km = miles * 1.609;

        System.out.println(miles + " miles equal to "+ km + " kilometers");
        input.close();
    }
}
