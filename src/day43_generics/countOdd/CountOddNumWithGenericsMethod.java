package day43_generics.countOdd;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CountOddNumWithGenericsMethod {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(countIf(list,new OddPredicate()));

    }
    public static <T> Integer countIf(Collection<T> collection, UnaryPredicate<T> predicate){
        int count = 0;
        for (T element : collection) {
            if (predicate.test(element)){
                count++;
            }
        }
        return count;
    }
}
interface UnaryPredicate<T>{
    boolean test(T obj);
}
class OddPredicate implements UnaryPredicate<Integer>{
    @Override
    public boolean test(Integer i) {
        if (i % 2 == 0){
            return false;
        }
        return true;
    }
}
