package day23_arrayList;

import java.util.ArrayList;

public class AvarageNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);


        System.out.println(list);


        int sum = 0;

        for (Integer eachInt : list) {
            sum += eachInt;  //getting sum of all elements
        }

        double avarege = sum / (double)list.size();

        System.out.println(avarege);

    }
}
