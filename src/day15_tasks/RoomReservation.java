package day15_tasks;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you wanna reserve a room?");
        String yesOrNo = input.nextLine().trim().toLowerCase();

        while (!(yesOrNo.equals("yes") || yesOrNo.equals("no"))){
            System.out.println("Invalid answer. Please re-enter your answer!");
            yesOrNo =input.nextLine().trim().toLowerCase();
        }
        if (yesOrNo.equals("yes")){
            System.out.println("pick your type of room");
            yesOrNo = input.nextLine().trim().toLowerCase();

            while ( !(yesOrNo.equals("king bed") || yesOrNo.equals("queen bed") || yesOrNo.equals("single bed")) ){
                System.out.println("invalid room type. Please re-enter room type");
                yesOrNo = input.nextLine().trim().toLowerCase();
            }

            if (yesOrNo.equals("king bed")){
                System.out.println("You picked King Bed room and your total 120$");

            } else if (yesOrNo.equals("queen bed")) {
                System.out.println("You picked Queen Bed room and your total 100$");

            }else if (yesOrNo.equals("single bed")){
                System.out.println("You picked Single Bed room and your total 80$");

            }else{
                System.out.println("Invalid bedroom type");
            }

        }else{
            System.out.println("Have a nice day");

        }
    }
}

