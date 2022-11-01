package day16_tasks;

public class NestedLoopWithStars {
    public static void main(String[] args) {

        for (int row = 1; row <= 10; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
