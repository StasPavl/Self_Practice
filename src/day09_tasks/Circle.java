package day09_tasks;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double r = input.nextInt();

        double Pi = 3.14;
        double areaCircle = Pi * (r * r);

        double perimeterCircle = 2 * (Pi * r);


        System.out.println("The area of your circle: " + areaCircle);
        System.out.println("The perimeter of your circle: " + perimeterCircle);


        input.close();
    }
}
