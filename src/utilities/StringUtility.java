package utilities;

public class StringUtility {

    public static String reverse(String word){
        String reverse = "";
        for (int i = word.length() - 1; i >=0 ; i--) {
            reverse += word.charAt(i);

        }
        return reverse;
    }
}
