package day15_tasks;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String userName = input.nextLine().toLowerCase();
        System.out.println("Enter your password");
        String password = input.nextLine().toLowerCase();


        String yourUserName = "Cydeo";
        String yourPassword = "Cydeo123";
        String result = "";

        for (int i = 1; i < 3; i++) {
            if (!userName.equalsIgnoreCase(yourUserName) || !password.equalsIgnoreCase(yourPassword)){

                System.out.println("Try one more time");
                System.out.println();
                System.out.println("Enter your username");
                userName = input.nextLine().toLowerCase();
                System.out.println("Enter your password");
                password = input.nextLine().toLowerCase();

                result = "locked";
            }

            if (userName.equalsIgnoreCase(yourUserName)&&password.equalsIgnoreCase(yourPassword)){
                result = "Logged in";
            }
        }
        System.out.println(result);
        input.close();
    }

}
