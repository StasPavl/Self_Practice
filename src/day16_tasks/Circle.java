package day16_tasks;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        double radius = input.nextDouble();
        String answer = "yes";

        while(answer.equals("yes")){
            while(  (radius <=0) ){
                System.out.println("Invalid entry for the radius of the circle. Please re-entre");
                radius = input.nextInt();
            }
            System.out.println("Diameter = " + 2 * radius);
            System.out.println("Area = " + 3.14 * (radius * radius));
            System.out.println("Perimeter = " + 2 * 3.14 * radius);

            System.out.println();

            System.out.println("Would you like to calculate another circle");
            answer = input.next().toLowerCase();
            while(!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid answer.Please re-entre your answer");
                answer = input.next().toLowerCase();
            }
            if (answer.equals("no")){
                System.out.println("Have a nice day");
                break;
            }
            System.out.println("Enter new radius of the circle:");
            radius = input.nextDouble();
        }


    }
}
/*
Diameter = 2 * radius
Area = 3.14 * (radius * radius)
Perimeter = 2 * 3.14 * radius
 */