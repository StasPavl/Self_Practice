package day12_tasks;

import java.util.Scanner;

public class EmailTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = input.nextLine();

        emailDomain(email);

        input.close();

    }
    //method display domain of email
    public static void emailDomain(String email){

        email = email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("Domain: "+email);
    }
}
