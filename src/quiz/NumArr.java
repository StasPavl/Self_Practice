package quiz;

public class NumArr {
    public static void main(String[] args) {
        int[] num1 = new int[3];
        int[] num2 = {1,2,3,4,5};
        num1 = num2;

        for (int i = 0; i < num2.length; i++) {
            System.out.print(num1[i]);
        }
    }
}
