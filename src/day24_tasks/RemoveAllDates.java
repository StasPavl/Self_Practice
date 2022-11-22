package day24_tasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllDates {

        public static void main(String[] args) {

            ArrayList<LocalDate> list = new ArrayList<>();

            list.addAll(Arrays.asList(LocalDate.of(2022,2,2),LocalDate.of(2006,4,21),LocalDate.of(1999,10,12),
                    LocalDate.of(2018,1,13),LocalDate.of(2001,9,11),LocalDate.of(2017,7,11) ) );

            list.removeIf(p-> p.isBefore(LocalDate.of(2016,8,15)));

            for (LocalDate localDate : list) {
                System.out.println(localDate);
            }
        }
    }
/*
create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016
 */

