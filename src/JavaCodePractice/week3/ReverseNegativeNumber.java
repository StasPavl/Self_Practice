package JavaCodePractice.week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println(ReverseNegativeNumber.reverseNeg(-1224));

    }

    //Solution 1 through String method
    public static int reverseNeg(int num) {

        boolean isNegative = false;

        if (num < 0) {
            num = num * -1;// -12 * -1 = 12
            isNegative = true;
        }

        String originalNum = String.valueOf(num);// convert num to string

        String reversedStringNum = "";//21

        for (int i = originalNum.length() - 1; i >= 0; i--) {
            reversedStringNum += originalNum.charAt(i);
        }
        if (isNegative) {
            return Integer.parseInt(reversedStringNum) / -1; //convert String back to Integer
        }
        return Integer.parseInt(reversedStringNum);
    }
}
    //Solution 2
    /*public static int reverseNeg(int num){
        boolean isNegative = false;
        if (num < 0){
            num = num * -1; // num *= -1
            isNegative = true;
        }

        int temp = num;// special for out while loop        12

        int result = 0; //where we gonna add our reversed number      21


        while (temp != 0){
            result = (result * 10) + (temp % 10) ; // from % operation we getting last digit from our integer NUM
            temp = temp / 10; // temp /= 10 //
        }
        // i++ i--
        if (isNegative){
            return result * -1;
        }
        return result;
    }
}*/
/*
 int num = -427

 num(-427) = num(427)

 String num(427)
 reverseString = "724"
 Intger.
 output = -724
----------------------------------------------------
solution 2
num(-427) = num(427)
while loop
427 % 10 =7
int newNUm = 0 (7 *10)
72 * 10 + 4 % 10;
427 / 10 = 4
 */

