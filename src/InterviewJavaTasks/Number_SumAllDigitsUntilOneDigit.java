package InterviewJavaTasks;

public class Number_SumAllDigitsUntilOneDigit {

    public static void main(String[] args) {

        /*int num = 4565;

        int temp = num;
        int result = 0;*/




     /*       while (temp != 0) {
                result += temp % 10;// 29
                temp /= 10;
            }
            temp = result;//29 + 9 + 2
            result = 0;

           temp = result;//29 + 9 + 2
        result = 0;
        while(temp !=  0){
            result += temp % 10;// 29
            temp/=10;
        }
        temp = result;//29 + 9 + 2
        result = 0;
        while(temp !=  0){
            result += temp % 10;// 29
            temp/=10;
        }*/
        int n = 12345;
        int result = 0;

        while (n >= 10) {
            result = 0;

            while (n > 0) {
                result += n % 10;
                n /= 10;
            }

            n = result;
        }
        System.out.println(result);




    }

}

 /*
    Sum all digits of a number until you have one digit number
    EX:
        input: 45659
        output:
                29
                11
                2
        Explanation:
                4+5+6+5+9=29
                2+9=11
                1+1=2
     */
