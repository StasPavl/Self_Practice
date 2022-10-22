package day12_tasks;

import java.util.Scanner;

public class dayName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of day");
        int number = input.nextInt();

        day(number);
    }
    //method which convert number of the day to name of the day
    public static void day(int num){
        String result="";

        if(num >= 1 && num <= 7) {
            result = (num == 1) ? "MOnday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday" : (num == 4) ? "Thursday" : (num == 5) ? "Friday"
                    : (num == 6) ? "Saturday" : "Sunday";
        }else{
            result = "Invalid number of the day";
        }
        System.out.println(result);
    }
}
