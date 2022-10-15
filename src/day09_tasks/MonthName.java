package day09_tasks;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month = input.nextInt();
        String result;
        if(month >= 1 && month <= 12){
            result = (month == 1) ? "January" : (month == 2) ? "February" : (month == 3) ? "March" : (month == 4) ? "April" : (month == 5) ? "May"
                    : (month == 6) ? "June" : (month == 7) ? "July" : (month == 8) ? "August" : (month == 9) ? "September" : (month == 10) ? "October" : (month == 11) ? "November" : "December";

        }else{
            result = "Invalid month";

        }
        input.close();
        System.out.println(result);
    }
}
