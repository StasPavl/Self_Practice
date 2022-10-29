package day15_tasks;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        //we need num1 / num2
        int num1 = 15;
        int num2 = 3;
        int result = 0;


        while ((num1 >=num2)){
            num1-=num2;
            result ++;
        }
        System.out.println("result = " + result);

    }
}
