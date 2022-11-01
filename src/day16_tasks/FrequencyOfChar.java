package day16_tasks;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result = "";



        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
               if (ch == str.charAt(j)){
                   count ++;
               }
            }
            if (!result.contains(""+ch)){
                result +=""+ch + ""+count;
            }
        }


        System.out.println(result);




    }
}
