package day09_tasks;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your current speed:");
        int speedLimit = 55;
        int currentSpeed = input.nextInt();

        int overSpeed = currentSpeed -speedLimit;

        if(currentSpeed > speedLimit){
            System.out.println("You are driving " + overSpeed + " mph over the limit. Slow down.");
        }
        input.close();
    }
}
