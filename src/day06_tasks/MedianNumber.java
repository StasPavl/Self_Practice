package day06_tasks;

public class MedianNumber {
        public static void main(String[] args) {

            int num1 = 30;
            int num2 = 10;
            int num3 = 15;

            boolean medianNumber2 = num2 > num1 && num2 < num3 || num2 > num3 && num2 < num1;//true or false
            //                          (false)   ||     (true)
            boolean medianNumber1 = num1 > num2 && num1 < num3 || num1 < num2 && num1 > num3;

            boolean medianNumber3 = num3 > num1 && num3 < num2 || num3 < num1 && num3 > num2;



            if(medianNumber2) {
                System.out.println("Median Number is " + num2);
            }
            if(medianNumber1){
                System.out.println("Median Number is " + num1);
            }
            if(medianNumber3){
                System.out.println("Median Number is " + num3);
            }


        }
    /*
    1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
     */
    }
