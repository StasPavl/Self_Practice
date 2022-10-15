package day09_tasks;

import java.util.Scanner;

public class Roommates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many people you live with?");
        int ppl = input.nextInt();

        if(ppl<3){
            System.out.println("Live with less 3 people");
        }else if (ppl >= 3 && ppl <= 6){
            System.out.println("Live with 3 - 6 people");
        }else{
            System.out.println("Live with more 6 people");
        }
        input.close();
    }
}
