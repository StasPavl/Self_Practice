package JavaCodePractice.week3;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println(ArmstrongNumber.isArmstrong(002));
       /* for (int i = 1; i <10000 ; i++) {
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }*/

    }

    public static boolean isArmstrong(int num) {
        int count = 0; //how many symbols in our number  3

        int temp = num; // for  while loops

        int armNum = 0; //summary  8 + 163 + 64
//         4
        while (temp != 0) {
            temp = temp / 10; //4 / 10 = 0
            count++;
        }
// 472
        temp = num;// reassigned out temp num which is zero after our first while loop to our original number again for
        // our second while loop
// 2 *2*2 = 8  47 / 10 = 4
        while (temp != 0) {
            armNum += Math.pow(temp % 10, count); // (123 % 10 = 3 ; )    (12 % 10 = 2 ; 12 / 10 = 1)
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

370 = 3-7-0 (3)
//        3*3*3  7*7*7    0*0*0
           27     343      0   =  343+27 (370)
armNum = (3^3) + (7^3) + (0^3)
isArmstrong(true) => num(370) == armNum(370)
 */

