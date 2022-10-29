package day15_tasks;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "aabbbccbb";
        char ch = 'b';
        int output = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                output ++;
            }
        }
        System.out.println("output = " + output);
    }
}
