package quiz;

import java.util.Arrays;

public class CharArr {
    public static void main(String[] args) {
        char[] array = {'D','C','B','A'};
        Arrays.sort(array);

        for (char each : array) {
            System.out.print(each + " ");

            if (each == 'D'){
                continue;
            }
        }
    }
}
