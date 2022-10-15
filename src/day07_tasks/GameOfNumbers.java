package day07_tasks;

public class GameOfNumbers {
    public static void main(String[] args) {

        int alexNum = 15;

        int stasNum = 83;

        int total = 0;


        if (stasNum > 0) {


            if (stasNum % 2 == 0) {
                total = alexNum + 5;
            } else {
                total = alexNum - 5;
            }

            System.out.println(total);
        } else {
            System.out.println("HUYINYA");
        }
    }
}
