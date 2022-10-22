package day06_tasks;

public class NumberTwoWord {
    public static void main(String[] args) {

        int number = 1;
        String result = "";

        if(number == 0){
            result = "Zero";
        } else if (number == 1) {
            result = "One";
        }else if(number == 2){
            result = "Two";
        }else if (number == 3){
            result = "Three";
        }else if (number == 4){
            result = "Four";
        }else if (number == 5){
            result = "Five";
        }else if (number == 6){
            result = "Six";
        }else if (number == 7){
            result = "Seven";
        }else if (number == 8){
            result = "Eight";
        }else{
            result = "Nine";
        }
        System.out.println(result);
    }
    /*
    Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement
     */
}
