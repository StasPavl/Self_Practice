package JavaCodePractice.week3;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(ArmstrongNumber.isArmstrong(820));

    }

    public static boolean isArmstrong(int num) {
        int count = 0; //how many symbols in our number

        int temp = num;// for  while loops

        int armNum = 0; //summary

        while (temp != 0) {
            temp = temp / 10; //
            count++;
        }

        temp = num;// reassigned out temp num which is zero after our first while loop to our original number again for
        // our second while loop

        while (temp != 0) {
            armNum += Math.pow(temp % 10, count); // (123 % 10 = 3 ; 123 / 10 = 12)    (12 % 10 = 2 ; 12 / 10 =1)
            temp = temp / 10;//1
        }

        if (num == armNum) {
            return true;
        }

        return false;
    }
}
/*
1630 = 1-6-3-0(4)
370 = 3-7-0(3)
           27     343      0   =  343+27 (370)
armNum = (3^3) + (7^3) + (0^3)
isArmstrong(true) => num(370) == armNum(370)
 */

