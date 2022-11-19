package randomPractice;

import java.util.Arrays;

public class task {
    public static void main(String[] args) {



        String[] arr = {"   Irina", "Hello"};
        String str = "";

        for (String each : arr) {
            each = each.trim();
            str += each + ",";

        }
        System.out.println(str);
        arr = str.split(",");

        //arr[0].trim();
        System.out.println(Arrays.toString(arr));


        System.out.println(Arrays.toString(arr)); //[   Irina   , Hello]
    }
}
