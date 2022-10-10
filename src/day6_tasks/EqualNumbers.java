package day6_tasks;

public class EqualNumbers {
    public static void main(String[] args) {

        int n1 = 2;
        int n2 = 3;
        int n3 = 3;

        String result = "";

        if (n1 == n2 && n2 == n3) {
            result = "all equal";
        }
        if (n1 == n2 && n2 != n3) {
            result = "n1 and n2 are equal";
        }
        if (n1 != n2 && n2 == n3) {
            result = "n2 and n3 are equal";
        }
        if (n1 != n2 && n2 != n3 && n3 == n1) {
            result = "n1 and n3 are equal";
        }
        if (n1 != n2 && n2 != n3 && n3 != n1) {
            result = "none of them are equal";
        }
        System.out.println(result);
    }
}
