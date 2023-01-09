package randomPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        int[][] num = {{1,2}, { 3,4}};
        num[1] = num[0];
        System.out.println(Arrays.toString(num[18]));


        ArrayList<Integer> list = new ArrayList<>();



        System.out.println(list.addAll(Arrays.asList(1,2,3,4,5)));
        System.out.println(list.addAll(Arrays.asList(1,2,3,4,5)));
        System.out.println(list.addAll(Arrays.asList(1,2,3,4,5)));
        System.out.println(list.add(1));
    }
}
