package day24_tasks;

import java.util.ArrayList;

public class CountryNames {
    public static void main(String[] args) {


                ArrayList<String> counties = new ArrayList<>();
                counties.add("Ukraine");
                counties.add("Moldova");
                counties.add("Spain");
                counties.add("Mexico");
                counties.add("Canada");
                counties.add("Kazakhstan");
                counties.add("Australia");
                counties.add("Germany");
                counties.add("Netherlands");
                counties.add("United State Of America");

                counties.removeIf(p -> p.length() >= 10);
                System.out.println(counties);
            }
        }
/*
Create an ArrayList of string called country names, write a program that can remove all the country names that have length of 10 or greater
 */
