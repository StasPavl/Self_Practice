package day23_arrayList;

import java.util.ArrayList;

public class firstUniqueChar {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {1, 1, 2, 3, 3, 4, 5, 5, 6};
        //int[] arr = {1, 1, 2, 3, 3, 4, 5, 5, 6};

        for (int each : arr) {
            list.add(each);
        }
        System.out.println(list);

        for (Integer each : list) {
            int frequency = 0;
            for (Integer each2 : list) {
                if (each == each2) {
                    frequency++;
                }
            }
            if (frequency == 1){
                System.out.println(each);
                break;
            }
        }

    }
}
