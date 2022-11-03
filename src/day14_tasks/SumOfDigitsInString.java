package day14_tasks;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        String text = "11B2C3";
        int num = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) - 48 >= 0 &&text.charAt(i)-48 <= 9) {
                num += text.charAt(i)-48;

            }
        }
        System.out.println(num);
    }
}
