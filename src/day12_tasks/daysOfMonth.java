package day12_tasks;

import java.util.Scanner;

public class daysOfMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month name");
        String monthName = input.next().toLowerCase();

        daysIn(monthName);
    }
//method which saying how many days in monthName
    public static void daysIn(String monthName) {

        String result = "";
        switch (monthName) {
            case "january":
                result = "January has 31 days";
                break;
            case "february":
                result = "February has 28 days";
                break;
            case "march":
                result = "March has 31 days";
                break;
            case "april":
                result = "April has 30 days";
                break;
            case "may":
                result = "May has 31 days";
                break;
            case "june":
                result = "June has 30 days";
                break;
            case "july":
                result = "July has 31 days";
                break;
            case "august":
                result = "August has 31 days";
                break;
            case "september":
                result = "September has 30 days";
                break;
            case "october":
                result = "October has 31 days";
                break;
            case "november":
                result = "November has 30 days";
                break;
            case "december":
                result = "December has 31 days";
                break;
            default:
                result = "invalid monthName";


        }
        System.out.println(result);
    }
}


/*
Hints:
            	Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
 */