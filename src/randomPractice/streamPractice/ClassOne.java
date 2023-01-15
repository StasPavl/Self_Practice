package randomPractice.streamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassOne {
    public static void main(String[] args) {
        //                                                       ----------------Stream SKIP Function----------------
        //                                                                 return element after your number
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));

        System.out.println(numbers);
        System.out.println(numbers.stream().skip(3).collect(Collectors.toList()));

        System.out.println("-------------------------------");

        //                                                       ----------------Stream LIMIT Function----------------
//                                                                       return first element until your number
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));

        System.out.println(numbers1);
        System.out.println(numbers1.stream().limit(5).collect(Collectors.toList()));
        System.out.println("--------------------------------");
    }

}
