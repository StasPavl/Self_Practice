package JavaCodePractice.week4;


import java.util.Arrays;
import java.util.Collections;

    public class SameLetters  {
        public static void main(String[] args) {

            String str1 = "abca";//3
            String str2 = "abcc";//###c


        }
        public static boolean sameLetter3(String str1, String str2){
            int count = 0;

            for (int i = 0; i < str1.length() ; i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j)){
                        str2 = str2.replaceFirst(String.valueOf(str2.charAt(j)), "#");
                        count++;
                        break;
                    }
                }
            }


            if (count == str1.length()) {
                return true;
            }
            return false;


        }
        public static boolean sameLetter2 (String str1, String str2){

            int sumOfStr1 = 0;
            int sumOfStr2 = 0;

            for (int i = 0; i < str1.length(); i++) {
                sumOfStr1 += str1.charAt(i);
            }
            for (int j = 0; j < str2.length(); j++) {
                sumOfStr2 += str2.charAt(j);
            }
            if (sumOfStr1 == sumOfStr2) {
                return true;
            }
            return false;
        }
        public static boolean sameLetter(String str1, String str2){

            String[] arr1 = str1.split("");
            String[] arr2 = str2.split("");

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1,arr2)) {
                return true;
            }

            return false;
        }
    }
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */

