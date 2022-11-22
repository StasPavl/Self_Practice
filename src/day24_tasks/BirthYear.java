package day24_tasks;

import java.time.LocalDate;
import java.util.Scanner;

public class BirthYear {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your birth year:");
            int year = input.nextInt();
            System.out.println("Enter your birth month");
            int month = input.nextInt();
            System.out.println("Enter your birth date");
            int date = input.nextInt();

            LocalDate birthday = LocalDate.of(year,month,date);
            boolean isLeap = birthday.isLeapYear();

            System.out.println(isLeap);
        }
    }
/*
Create a function that accepts an int argument birthYear,
return true if the person was born on leap year, otherwise return false
 */

