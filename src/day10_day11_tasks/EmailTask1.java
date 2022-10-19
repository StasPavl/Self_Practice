package day10_day11_tasks;

public class EmailTask1 {
    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";


        int before_ = email.lastIndexOf('_');

        int after_ = email.indexOf('_')+1;
        int end2 = email.lastIndexOf('@');

        int domain = email.indexOf('@');

        int end4 = email.indexOf("_");
        int end5 = email.indexOf("_")+1;

        //first part before "_"
        String first = email.substring(0,before_);

        //second part after "_"
        String second = email.substring(after_,end2);

        //separate domain
        String third = email.substring(domain);

        //separate "_"
        String fourth = email.substring(end4,end5);

        System.out.println(second + fourth + first + third);



        //OR ANOTHER OPTION WHICH MUCH FASTER
        String email1 = email.replace(second,first);
        String email2 = email1.replaceFirst(first,second);
        System.out.println(email2);




    }
}
