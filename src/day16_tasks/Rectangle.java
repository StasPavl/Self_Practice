package day16_tasks;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        double length = input.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        double width = input.nextDouble();


        String answer = "yes";

        while(answer.equals("yes")){

            while(  length <=0 || width <=0 ){
                System.out.println("Invalid entry. Please re-entre");

                System.out.println("Enter the length of the rectangle:");
                length = input.nextDouble();
                System.out.println("Enter the width of the rectangle:");
                width = input.nextDouble();
            }

            System.out.println("Area = " + length * width);
            System.out.println("Perimeter = " + 2 * (length + width));

            System.out.println();

            System.out.println("Would you like to calculate another rectangle");
            answer = input.next().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid answer.Please re-entre your answer");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")){
                System.out.println("Have a nice day");
                break;
            }
            System.out.println("Enter new length of the rectangle:");
            length = input.nextDouble();
            System.out.println("Enter new width of the rectangle:");
            width = input.nextDouble();
        }


    }
}
