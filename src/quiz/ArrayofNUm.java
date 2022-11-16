package quiz;

import java.util.Arrays;

public class ArrayofNUm {
    public static void main(String[] args) {
        int[] intArr = {14,30,45,60,75};
        intArr[2] = intArr[4];
        intArr[4] = 90;
        System.out.println(Arrays.toString(intArr));

        String[] planets = {"Mercury","Venus","Earth","Mars"};
        int x = planets.length;
        int y = planets[1].length();

        System.out.println(x+" "+ y);

        int[] arr = {1,2,3,4};
        int i = 0;
        do {
            System.out.println(arr[i] + " ");
            i++;
        }while (i<arr.length-1);
    }
}
