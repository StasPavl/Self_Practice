package day16_tasks;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPrice = 0;
        String answer = "yes";

        System.out.println("Do you wanna reserve a room?");
        answer = input.nextLine().trim().toLowerCase();


        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.out.println("Invalid answer. Please re-enter your answer!");
            answer = input.nextLine().trim().toLowerCase();
        }


        while (answer.equals("yes")) {


            System.out.println("pick your type of room");
            String typeOfRoom = input.nextLine().trim().toLowerCase();

            while (!(typeOfRoom.equals("king bed") || typeOfRoom.equals("queen bed") || typeOfRoom.equals("single bed"))) {
                System.out.println("invalid room type. Please re-enter room type");
                typeOfRoom = input.nextLine().trim().toLowerCase();
            }
            System.out.println("How many days do you wanna stay?");
            int days = input.nextInt();
            input.nextLine();

            if (typeOfRoom.equals("king bed")) {
                totalPrice += 120 * days;
                System.out.println("You picked King Bed room and your total is: $" + totalPrice);

            } else if (typeOfRoom.equals("queen bed")) {
                totalPrice += 100 * days;
                System.out.println("You picked Queen Bed room and your total is : $" + totalPrice);

            } else if (typeOfRoom.equals("single bed")) {
                totalPrice += 80 * days;
                System.out.println("You picked Single Bed room and your total is: $" + totalPrice);

            } else {
                System.out.println("Invalid bedroom type");
            }
            System.out.println();

            System.out.println("Do You wanna reserve another room?");
            answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid answer. Please re-enter your answer!");
                answer = input.next().toLowerCase();
            }

            input.nextLine();

            if (answer.equals("no")) {
                System.out.println("have a nice day");
                break;
            }



        }
        if (answer.equals("no")){
            System.out.println("Your total is: $" + totalPrice);
        }
    }

}


