package day16_tasks;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String result = "";

        for (int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);//every char from string
            int count = 0;

            for (int j = 0; j < str.length(); j++){
                if (ch == str.charAt(j)){
                    count ++;
                }
            }
            if (!result.contains(""+ch) && count == 1){
                result +=""+ch;
            }
        }
        System.out.println(result);
    }
}
