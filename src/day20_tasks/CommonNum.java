package day20_tasks;

public class CommonNum {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};
        String result = "";
        for (int each : arr1) {
            for (int each2 : arr2) {
                if (each2 == each){
                    result += each2 + " ";
                }
            }

        }
        System.out.println(result);
    }
}
