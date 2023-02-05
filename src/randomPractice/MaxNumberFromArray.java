package randomPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class MaxNumberFromArray {
    public static void main(String[] args) {
        Integer[] arr = {1,4,7,12,4,2,9,4,5,88};

        Optional<Integer> max = Arrays.stream(arr).max(Integer::compareTo);
        System.out.println(max.get());
    }
}
