package day09_tasks;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String result = "";

        System.out.println("Enter your score:");
        int score = input.nextInt();


        if (score >= 0 && score <= 100) {

            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
            System.out.println("Your grade: " + result);

        }else{
            System.out.println("Invalid score");
        }

    input.close();
    }
}
