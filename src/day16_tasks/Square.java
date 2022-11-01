package day16_tasks;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side of square:");
        double sideOfSquare = input.nextDouble();


        String answer = "yes";

        while(answer.equals("yes")){

            while(  (sideOfSquare <=0) ){
                System.out.println("Invalid entry for the side of square. Please re-entre");
                sideOfSquare = input.nextInt();
            }

            System.out.println("Area = " + sideOfSquare * sideOfSquare);
            System.out.println("Perimeter = " + 4 * sideOfSquare);

            System.out.println();

            System.out.println("Would you like to calculate another square");
            answer = input.next().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid answer.Please re-entre your answer");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")){
                System.out.println("Have a nice day");
                break;
            }
            System.out.println("Enter new side of square:");
            sideOfSquare = input.nextDouble();
        }


    }
}

