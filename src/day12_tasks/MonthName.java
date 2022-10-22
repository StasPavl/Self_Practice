package day12_tasks;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Month");
        int number = input.nextInt();

        monthName(number);
    }
    //method which convert number of month to the name of month
    public static void monthName(int num){
        String result="";

        if(num >= 1 && num <= 12){
            result = (num == 1) ? "January" : (num == 2) ? "February" : (num == 3) ? "March" : (num == 4) ? "April" : (num == 5) ? "May"
                    : (num == 6) ? "June" : (num == 7) ? "July" : (num == 8) ? "August" : (num == 9) ? "September" : (num == 10) ? "October" : (num == 11) ? "November" : "December";

        }else {
            result = "Invalid month";
        }
        System.out.println(result);
    }
}
