package day13_tasks;

public class MinAndMax {
    public static void main(String[] args) {
        System.out.println(max(4.5,21));
    }
    public static double max(double n1 , double n2) {
        if (n1 > n2) {
            return n1;
        }
        return n2;
    }
    public static double min(double n1 , double n2) {
        if (n1 > n2) {
            return n2;
        }
        return n1;
    }

}
