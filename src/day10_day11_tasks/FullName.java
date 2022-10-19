package day10_day11_tasks;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first name");
        String firstName = input.next();

        System.out.println("enter last name");
        String lastName = input.next();

        input.close();

        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();

        String f1 = firstName.substring(0,1).toUpperCase();
        String l1 = lastName.substring(0,1).toUpperCase();

        firstName = firstName.substring(1);
        lastName = lastName.substring(1);

        System.out.println("First name: "+ f1 + firstName);
        System.out.println("Last name: "+ l1 + lastName);
    }
}
