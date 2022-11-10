package day20_tasks;

public class UniqueElements {
    public static void main(String[] args) {
        int[] num = {5,4,231,4,24,2,4,2,3,1,6,7,4,5,6,9,3,7,8};
       // String unique = "";
        for (int each : num) {
            int count = 0;
            for (int each1 : num) {
                if (each == each1){
                    count ++;
                }
            }
            if(count == 1){
                System.out.println(each);
            }
        }


    }
}
