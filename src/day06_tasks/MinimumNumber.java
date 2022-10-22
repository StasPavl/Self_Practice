package day06_tasks;

public class MinimumNumber {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 12;

        if(num1 < num2){
            System.out.println(num1 + " is the minimum number");
        }
        if(num2 < num1){
            System.out.println(num2 + " is the minimum number");
        }
        if(num1 == num2){
            System.out.println("Both equal");
        }
    }
}
