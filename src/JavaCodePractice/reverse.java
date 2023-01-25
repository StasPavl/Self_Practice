package JavaCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverse {
    public static void main(String[] args) {
        /*String str = "ABC";
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        Collections.reverse(list);

        for (String s : list) {
            System.out.print(s);*/

            StringBuilder sb = new StringBuilder("ABC");
            sb.reverse();
            System.out.println(sb);
        }
    }

