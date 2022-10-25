package day13_tasks;

import java.util.Scanner;

public class FrequencyOfWord {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your whole text");
            String userText = input.nextLine().toLowerCase();
            System.out.println("Enter search word:");
            String userWord = input.nextLine().toLowerCase();

            System.out.println(frequencyOfWord(userText,userWord));
        }
        public static int frequencyOfWord(String userText, String userWord)
        {
        /*
        String text = "Java Java Java Java  Java Python Sasha C++ Stanislav Java
        Lava Cafe Bla Bla Bla -- I Love Java";
        */
            int textNumber = userText.length();
            String newWord = userWord.substring(1);
            String text2 = userText.replace(userWord, newWord);
            int currentTextNumber = text2.length();

            return textNumber - currentTextNumber;


        }
    }

