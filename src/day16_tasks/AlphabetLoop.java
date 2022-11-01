package day16_tasks;

public class AlphabetLoop {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'E'; ch++){
            for (char ch2 = 'a'; ch2 <= 'z'; ch2 ++){
                System.out.print((""+ch)+(""+ch2) + " ");
            }
            System.out.println();
        }
    }
}
