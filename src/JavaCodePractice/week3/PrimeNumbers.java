package JavaCodePractice.week3;

public class PrimeNumbers{

        public static void main(String[] args) {

            System.out.println();
            System.out.println(PrimeNumbers.isPrime(23));


        }

        public static boolean isPrime(int num) {
            if (num == 0 || num == 1) {
                return false;
            }

            for (int i = 2; i < num; i++) { //21 => 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
                //   5  % 4
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
}
