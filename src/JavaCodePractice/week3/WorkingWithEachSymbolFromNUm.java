package JavaCodePractice.week3;

public class WorkingWithEachSymbolFromNUm {
    public static void main(String[] args) {

        int num = 123;



        int hundreds = 0;
        int tens = 0;
        int ones = 0;

//        0  =  123 % 10
        ones = num % 10;//3

//       12 = 123 / 10
        num = num /10; //12

//       0   = 12  % 10
        tens = num % 10;//2

//       1  =  12 / 10
        num = num /10;//1

//       0  =  1 % 10
        hundreds = num % 10;

        System.out.println("ones = " + ones);
        System.out.println("tens = " + tens);
        System.out.println("hundreds = " + hundreds);





    }
}
