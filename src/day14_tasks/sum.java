package day14_tasks;

public class sum {
    public static void main(String[] args) {
        int sum = 0;
        int sum2 = 0;

        for (int i = 1; i <= 100; i++) {
             sum += i;
        }
        System.out.println(sum);

        for (int i = 1; i <= 50; i++) {
            sum2 += i;
        }
        System.out.println(sum2);

    }
}
