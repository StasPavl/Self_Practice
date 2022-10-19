package day10_day11_tasks;

import java.util.Locale;

public class EmailTask2 {
    public static void main(String[] args) {
        String email = "craig_federighi@apple.com";
        //int start = email.indexOf(0);
        int before_ = email.lastIndexOf('_');

        int after_ = email.indexOf('_')+1;
        int end2 = email.lastIndexOf('@');

        int domainStart = email.indexOf('@') +1;
        int domainEnd = email.lastIndexOf(".");

        int end4 = email.indexOf("_");
        int end5 = email.indexOf("_")+1;

        String firstName = email.substring(0,before_).toLowerCase();
        String lastname = email.substring(after_,end2).toLowerCase();
        String domain = email.substring(domainStart,domainEnd);

         String f1 = firstName.substring(0,1).toUpperCase();
         firstName = f1 + firstName.substring(1);

         String l1 = lastname.substring(0,1).toUpperCase();
         lastname = l1 + lastname.substring(1);

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastname);
        System.out.println("Domain: " + domain);

    }
}
