package randomPractice;

import java.util.Arrays;

public class AddNumFromString {
    public static void main(String[] args) {
        String str = "12hello world13";
        //System.out.println(sumOfAllDigitsInString(str));
        System.out.println(sumOfDigitsWithException(str));


        //1+2+1+3
    }
    public static int sumOfAllDigitsInString(String str){
//"11Hello1" = 3
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                result += Character.getNumericValue(str.charAt(i));
            }
        }
        return result;
    }
public static int sumOfDigitsWithException(String str){
//"11hello1" = 3
    String[] str1 = str.split("");

    int result = 0;

    for (String each : str1) {
        try {
            result += Integer.parseInt(each); //
        } catch (NumberFormatException e) {

        }
    }

    return result;
}

}
