package day14_tasks.SelfPractice;

public class Numbers {
    /*
    Write a program which prints the even numbers between 1 to 100 in increasinf order and decreasing order
     */
    public static void main(String[] args) {

        for (int i = 100; i >1; i--) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
