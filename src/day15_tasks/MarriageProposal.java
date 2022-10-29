package day15_tasks;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Will you marry me?");

        String yesOrNo = input.next().toLowerCase();


        while (! (yesOrNo.equals("yes") || yesOrNo.equals("no"))){
            System.out.println("Invalid answer, please re-enter");
            yesOrNo = input.next().toLowerCase();
        }
        if (yesOrNo.equals("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Good bye");
        }
                input.close();
    }
}
