package day04_tasks;

public class SwapTwoVariables {
    public static void main(String[] args) {

        int x = 10; // need to get x =15 and y = 10
        int y = 15;

        x = x + y; //25
        y = x - y; //10
        x = x - y; //15
        System.out.println(x);
        System.out.println(y);


    }
}
