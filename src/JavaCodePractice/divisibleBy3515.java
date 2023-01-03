package JavaCodePractice;

public class divisibleBy3515 {
    public static void main(String[] args) {

        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 1; i <= 100; i++) {

            if ( i%3==0 || i%5==0 || i%15==0) {
                if (i % 15 ==0) {
                    divisibleBy15 += i + " ";
                } else if (i % 5 == 0) {
                    divisibleBy5 += i + " ";
                } else {
                    divisibleBy3 += i + " ";
                }
            }
        }
        System.out.println("divisibleBy3 = " + divisibleBy3);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy15 = " + divisibleBy15);
    }
}
