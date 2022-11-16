package day22_tasks;

public class TrueOrFalse {

        public static void main(String[] args) {
            String str = "JAVA java";
            str = str.replaceAll(" ","");


            char[] ch = str.toCharArray();

            int countL = 0;
            int countU = 0;

            for (char each : ch) {
                if (Character.isLowerCase(each)){
                    countL++;
                }else{
                    countU++;
                }

            }
            if (countL == countU){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }
/*
Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

        Note: Use Wrapper class methods
 */

