package JavaCodePractice;

public class swapNumbers {
    public static void main(String[] args) {

        int x = 2;
        int y = 4;

        // need swap numbers so we should get x = 5 and y = 10


        x = x + y; //6
        y = x - y; //2
        x = x - y;//4

        System.out.println("y = " + y);
        System.out.println("x = " + x);
    }
}
