package day16_tasks;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score:");
        int score = input.nextInt();

        String answer = "yes";

        while(answer.equals("yes")){
            while(score < 0 || score > 100){

                System.out.println("Invalid Entry");

                System.out.println("Please re enter your score:");
                score = input.nextInt();
            }

            if (score >=90 && score<=100){
                System.out.println("A");
            } else if (score >= 80 && score <= 89) {
                System.out.println("B");
            } else if (score >= 70 && score <= 79) {
                System.out.println("C");
            } else if (score >= 60 && score <= 69) {
                System.out.println("D");
            }else{
                System.out.println("F");
            }
            System.out.println();

            System.out.println("Would you like enter another score?");
            answer = input.next().toLowerCase();

            while(! (answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid entry. Please re entre");
                answer = input.next().toLowerCase();
            }
            if (answer.equals("no")){
                System.out.println("Have a nice day");
                break;
            }

            System.out.println("Enter new your score:");
            score = input.nextInt();

        }

    }
}
