package day14_tasks.SelfPractice;

public class TaskWithLetters {
    public static void main(String[] args) {

        String str = "aaaaaaabbbbbbcccddddddefrrrr"; //need remove duplicates from the string
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(""+str.charAt(i))) {  //add to string only if they not contain in new string

                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
