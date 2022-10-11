package day08_tasks;

public class BiggerNum {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        int num3 = 8;

        String result ="";

        result = (num1 > num2 && num2 > num3 || num1 > num3 && num3 > num2) ? "num1 is bigger" :
                (num2 > num1 && num2 > num3 || num3<num2 && num1 < num2) ? "num2 is bigger": "num3 is bigger";

        System.out.println(result);
    }
}
