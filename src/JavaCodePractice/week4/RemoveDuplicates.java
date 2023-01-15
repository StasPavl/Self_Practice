package JavaCodePractice.week4;



import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
        public static void main(String[] args) {
            String str = "AAABBBCCC";


        }
        public static String removeDuplicates4(String str){
            //STREAM method
            String result ="";
            String[] arr = str.split("");
            List<String> list = new ArrayList<>();
            list.addAll(Arrays.asList(arr));

            list = list.stream().distinct().collect(Collectors.toList());
            for (String each : list) {
                result+= each;
            }
            return result;
        }
        public static String removeDuplicates3(String str){

            //StringBuilder METHOD

            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(0));

            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) != str.charAt(i-1)){
                    sb.append(str.charAt(i));
                }
            }
            return String.valueOf(sb);

        }
        public static String removeDuplicates2(String str){

            //SET METHOD

            String[] arr = str.split("");

            Set<String> set1 = new HashSet<>();
            set1.addAll(Arrays.asList(arr));

            String result = "";

            for (String each : set1) {
                result+=each;
            }
            return result;
        }
        public static String removeDuplicates(String str){

            //REGULAR method

            String result = "";

            for (int i = 0; i < str.length(); i++) {
                if (!result.contains(""+str.charAt(i))){
                    result += str.charAt(i);
                }
            }
            return result;
        }
    }
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */

