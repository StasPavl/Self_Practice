package day12_tasks;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first name");
        String firstName = input.nextLine().toLowerCase().trim();
        System.out.println("enter your last name");
        String lastName = input.nextLine().toLowerCase().trim();

        capitalization(firstName,lastName);
    }

    //method make and print first and last name with capital char
    public static void capitalization(String firstName, String lastName){
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        System.out.println("Full name: "+ firstName + " " + lastName);
    }
}
