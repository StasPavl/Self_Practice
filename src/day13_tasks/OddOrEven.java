package day13_tasks;

import java.util.Scanner;

public class OddOrEven {
    public class task1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int userNum = input.nextInt();
            System.out.println(isOdd(userNum));
            System.out.println(isEven(userNum));
        }

        public static boolean isOdd(int num) {
            return (num % 2 != 0) ? true : false;
            //if(num % 2 != 0){
            //return true;
            //}
            //return false;
        }

        public static boolean isEven(int num){
            return (num % 2 == 0) ? true : false;
        }
    }
}
