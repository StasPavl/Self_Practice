package day20_tasks;

import utilities.StringUtility;

public class Palidromes {
    public static void main(String[] args) {
        String[] str = {"anna", "level", "Java"};
        int count = 0;

        for (String each : str) {
            String reversed = StringUtility.reverse(each);
            if (reversed.equals(each)){
                count++;
            }
        }
        System.out.println(count);
    }
}
