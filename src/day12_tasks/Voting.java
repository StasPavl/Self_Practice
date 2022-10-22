package day12_tasks;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        int age = input.nextInt();
        System.out.println("Are you American citizen?(Yes/No");
        String yesNo = input.next().toLowerCase();
        boolean isAmerican = yesNo.equals("yes");

        eligibleToVote(age,isAmerican);
    }
    //method showing if you eligible to vote in America
    public static void eligibleToVote(int age, boolean isAmerican){
        if(age>= 21 && isAmerican == true){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
}
