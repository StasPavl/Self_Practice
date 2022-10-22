package day12_tasks;

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your Hourly rate");
        double hourlyRate = input.nextDouble();
        System.out.println("Enter your Weekly hours");
        int weeklyHours = input.nextInt();

        salary(hourlyRate,weeklyHours);
    }
    //method which count your gross income
    public static void salary(double hourlyRate, int weeklyHours){

        double grossIncome = hourlyRate * weeklyHours * 52;

        System.out.println("You make $" + hourlyRate + " per hour.");
        System.out.println("You work " + weeklyHours + " hours in a week.");
        System.out.println("Your gross income is $" + grossIncome );
    }
}
