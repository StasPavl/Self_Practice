package JavaCodePractice.week4;

public class Unique {

        public static void main(String[] args) {
            String text = "AABCCDfcnnm";
            String newString ="";
            char  everyCh;
            for (int i = 0; i < text.length(); i++) {
                everyCh = text.charAt(i);
                if (text.indexOf(everyCh) == text.lastIndexOf(everyCh)){
                    newString += everyCh;
                }
            }
            System.out.println(newString);
        }
    }

