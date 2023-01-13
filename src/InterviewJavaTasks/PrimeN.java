package InterviewJavaTasks;


public class PrimeN {
    public static void main(String[] args) {
        System.out.println(PrimeN.isPrime(2));
        System.out.println(PrimeN.isPrime(3));
        System.out.println(PrimeN.isPrime(4));
        System.out.println(PrimeN.isPrime(5));

    }
    //                                  21 => 1,2,3,4,5,6,7 etc
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }

        /*
        5 % 1 == 0
        5 % 5 == 0
         */
        for (int i = 2; i < number ; i++) { // 2,3 => 21 (not include)
            if (number % i == 0 ){
                return false;
            }
        }

        return true;
    }
}

