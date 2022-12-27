package JavaCodePractice;

public class TestClass {
    public static void main(String[] args) {

        OddAndEven obj = new OddAndEven();

        System.out.println(obj.oddOrEven(16));

        System.out.println("------------------------------");

        DivideWithOut obj1 = new DivideWithOut();


        System.out.println(obj1.divide(10,-2));// -2

        System.out.println("------------------------------");

        FinRa obj2 = new FinRa();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        String test = obj2.finra(numbers);

        System.out.println(test);


    }
}
