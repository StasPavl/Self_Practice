package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        ArrayList<String> nonDup = new ArrayList<>();

        for (String each : names) {
            if (nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);
        }
        names = nonDup;
        System.out.println(names);
    }
}
