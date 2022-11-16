package day22_tasks;

public class Retrive {

        public static void main(String[] args) {
            String str = "Wooden Spoon1!";
            char[] ch = str.toCharArray();

            String letters = "";
            String digits = "";
            String specialChars = "";

            for (char each : ch) {
                if (Character.isDigit(each)){
                    digits += each;
                } else if (!Character.isLetterOrDigit(each)) {
                    specialChars += each;
                }else{
                    letters+= each;
                }
            }
            System.out.println(letters);
            System.out.println(digits);
            System.out.println(specialChars);
        }

    }
/*
Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

        Note: Use Wrapper class methods

 */

