package day20_tasks;

public class EvenOddNum {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10,11,21,22,23,455,675,42132,54,55};
        int evenCount = 0;
        int oddCount = 0;
        for (int each : num) {
            if (each % 2 !=0){
                oddCount++;
            }else{
                evenCount++;
            }
        }
        System.out.println("Even numbers = " + evenCount);
        System.out.println("Odd Numbers = " + oddCount);
    }
}
