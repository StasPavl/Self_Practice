package randomPractice;

import java.util.Arrays;

public class WednesdayTasks {
    public static void main(String[] args) {
        //working only with index Of 2 ==> check on lesson
        int[] x = {17, 12, 10, 8};           // = > [2,3,1]
       // int[] y = {17, 12, 10, 8};      // = > [12,10,8,17]
       // int[] a = {7, 0, 0};          // = > [0,0,7]


        //
        //0 ==> x.length - 1
        //index - 1
        int[] new_x = new int[x.length];

        for (int i = 0; i < x.length; i++) {

            if (i == 0) {
                new_x[2] = x[i];
            } else if (i == 1) {
                new_x[0] = x[i];
            } else {
                new_x[1] = x[i];
            }
        }

        System.out.println(Arrays.toString(new_x));


        System.out.println("------------------------------------");

        String str = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

        str = str.replaceAll(", ", ",");

        String[] arr = str.split(",");

        String new_string = "";

        System.out.println(Arrays.toString(arr));
        System.out.println();

        for (String each : arr) {
            if (each.contains(" ")) {
                new_string += each + ",";
            }
        }
        String[] new_arr = new_string.split(",");
        System.out.println(new_string);
        System.out.println(Arrays.toString(new_arr));
        System.out.println("----------------------------------");
        System.out.println();

        String[] input = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet", "Asya"};

        int count = 0;
        for (String each : input) {
            each = each.toLowerCase();
            if (each.substring(0, 1).equals(each.substring(each.length() - 1))) {
              count++;
            }
        }
        System.out.println("Output: " + count);
        System.out.println("--------------------------------------");

        String[] arr1 = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String[] arr2 = {"abc", "dna", "kevin", "joe", "lamp"};

        String result = "";
        int num = 0;

        for (String eachWord : arr2) {
            int countL = 0;
            if (eachWord.contains(" ")){
                continue;
            }
            for (int i = 0; i < eachWord.length(); i++) {
                countL++;

            }
            if(countL > num){
                result = eachWord;
                num = countL;
            }
        }
        System.out.println(result);

    }


}


/*
 Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left"

        int[] x = {1,2,3};           // = > [2,3,1]
        int[] y = {17,12,10,8};      // = > [12,10,8,17]
        int[] a = {7,0,0};           // = > [0,0,7]


    Task 2 :    Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer"

        output : wooden spoons
                 trash can
                 dish washer


    Task 3 : Write a program that accepts String array.Count how many names have the same first and last letter

                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"

                Output : 4

    Task 4 :  For Each - Nested For

            Longest Palindrome

             Given a String array. Find the longest Palindrome String in your array.
                    Ex:
                    Input: ["java", "longer word", "civic" "apple", "racecar", "mom", "anna"] Output: racecar
                    Ex:
                    Input: ["abc", "dna", "kevin", "joe", "lamp"]
 */