package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addAll(0,numbers); //ADD ALL METHOD(WORKING ONLY WITH COLLECTIONS0-------------------------

        System.out.println(list);

        System.out.println("------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75,80,85,90));//Add ALl METHOD with asList Array Method---------------------

        System.out.println(scores);

        System.out.println("-------------------------------------");

        ArrayList<String> student = new ArrayList<>();
        student.addAll(Arrays.asList("Gadir","Hasan","Abidullah","Bilal"));

        System.out.println(student);

        student.addAll(2,Arrays.asList("Shukur","Stanislav", "Alexandra"));

        System.out.println(student);

        System.out.println("-------------------------------------");

        int[] nums = {1,2,3,4,5,6,7,8};
        Integer[] numbers2 = new Integer[nums.length];


        //HOW TO CONVERT INT[] TO INTEGER[]---------------------------------
        for (int i = 0; i < nums.length; i++) {
            numbers2[i] = Integer.valueOf(nums[i]);
        }


        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList( numbers2 ));

       // l1.addAll( Arrays.asList( nums ) );

        System.out.println(l1);

        System.out.println("-------------------------------------");


        ArrayList<String> employeesLIst = new ArrayList<>();
        employeesLIst.addAll(Arrays.asList("Alena","Muhtar","Gadir","Ali"));//CONTAINS ALL METHOD---------------------------

        System.out.println(employeesLIst);
        boolean hasAlena = employeesLIst.contains("Alena");

        boolean hasAlenaGadir = employeesLIst.containsAll(Arrays.asList("Alena","Gadir"));

        boolean hasMuhtarAliKuzzat = employeesLIst.containsAll(Arrays.asList("Muhtar", "Ali" , "Kuzzad"));

        System.out.println("hasAlena = " + hasAlena);
        System.out.println("HasAlenaGadir = " + hasAlenaGadir);
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat);

        System.out.println("-------------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,10,20,30,40,50,60,70,10,10,10,10,20,20,20,20));
        list3.removeAll(Arrays.asList(10,20));

        System.out.println(list3);

    }
}
