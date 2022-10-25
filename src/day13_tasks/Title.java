package day13_tasks;

public class Title {
        public static void main(String[] args) {
            System.out.println(title("jAvA"));
        }
        public static String title(String text1){
            return text1.toLowerCase().substring(0,1).toUpperCase() + text1.toLowerCase().substring(1);
        }
    }

