package day14_tasks;

public class Retrive {
    public static void main(String[] args) {


        String text = "mn@#123Ab!";

        String digits = "";
        String letters ="";
        String speceals = "";

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)>= 48 && text.charAt(i)<= 57){
                digits += text.charAt(i);
            } else if (text.charAt(i)>= 65 && text.charAt(i) <= 90 || text.charAt(i)>= 97 && text.charAt(i) <= 122) {
                letters += text.charAt(i);
            }else{
                speceals += text.charAt(i);
            }

        }
        System.out.println("Letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("speceals = " + speceals);
    }
}
