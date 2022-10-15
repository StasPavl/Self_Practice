package day09_tasks;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();
        input.nextLine();

        System.out.println("Enter math operator: ");
        char mathOper =  input.nextLine().charAt(0);

        System.out.println("Enter second number: ");
        double secondNumber = input.nextInt();
        double result;
        if(mathOper == '-' || mathOper == '*' || mathOper == '/' || mathOper == '+'){
            switch (mathOper){
                case '/':
                    result = firstNumber / secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                default:
                    result = firstNumber + secondNumber;
            }
            System.out.println("Result is: " + result);
            }else{
            System.out.println("Invalid math operator");
        }
        input.close();
    }
}
