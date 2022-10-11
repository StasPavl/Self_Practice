package day08_tasks;

public class Calculator {
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 3;
        char operator = '*';


        switch (operator) {
            case '-':
                System.out.println(num1 - num2);
                break;

            case '*':
                System.out.println(num1 * num2);
                break;

            case '/':
                System.out.println(num1 / num2);
                break;

            case '+':
                System.out.println(num1 + num2);
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}
