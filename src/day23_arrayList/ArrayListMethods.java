package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        array[0] = 100;

        System.out.println(Arrays.toString(array));

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);

        groceriesList.set(2, "Cookie");// SET METHOD--------------------------

        System.out.println(groceriesList);

        groceriesList.add(2,"Chicken");//ADD METHOD------------------------

        System.out.println(groceriesList);

        groceriesList.remove(0);
        System.out.println(groceriesList);//REMOVE METHOD (BY THE INDEX)--------------------

        groceriesList.remove("Paper Towels");
        System.out.println(groceriesList); //REMOVE METHOD (BY THE OBJECT)-------------------


        ArrayList<Integer> numbers = new ArrayList<>();//EXAMPLESE WITH NUMBERS-------------
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.remove(Integer.valueOf(10));
        System.out.println(numbers);


        numbers.clear();//CLEAR METHOD (REMOVING EVERYTHING FROM LIST)-------------------------
        System.out.println(numbers);


        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names.indexOf("Vasyl"));//INDEXOF AND LASTINDEXOF METHODS--------------------
        System.out.println(names.lastIndexOf("Vasyl"));
        System.out.println(names.lastIndexOf("Sumeye"));

        boolean hasMuhtar = names.contains("Muhtar");//CONTAIN METHOD-----------------
        boolean hasAli = names.contains("Ali");
        System.out.println("Muhtar =" + hasMuhtar);
        System.out.println("Ali =" + hasAli);
        System.out.println("-------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = list1;
        list1.add(10);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1 == l2);
        System.out.println(l1.equals(l2));//EQUAL METHOD------------------------------


        System.out.println("-------------------------------------");

        l1.clear();
        System.out.println(l1.isEmpty());//ISEMPTY METHOD---------------------
        System.out.println(list1.isEmpty());





    }
}
