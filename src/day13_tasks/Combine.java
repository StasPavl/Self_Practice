package day13_tasks;

public class Combine {
        public static void main(String[] args) {
            String word1 = "word";
            String word2 = "dota";


            System.out.println(combine(word1,word2));

        }

        public static String combine(String text1, String text2) {
            if (text1.toLowerCase().substring(text1.length() - 1).equals(text2.toLowerCase().substring(0, 1))) {
                return text1 + text2.substring(1);
            }
            return text1 + text2;
        }
    }
