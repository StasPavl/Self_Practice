package day09_tasks;

import java.util.Scanner;

public class MyInfo {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter your age");
            int age = input.nextInt();

            System.out.println("Enter your gender");
            String gender = input.next();

            input.nextLine();

            System.out.println("Enter your full name");
            String fullName = input.nextLine();

            System.out.println("Enter your phone number");
            long phone = input.nextLong();

            System.out.println("Enter your zip code");
            int zipCode = input.nextInt();

            input.nextLine();

            System.out.println("Enter your school name");
            String schoolName = input.nextLine();

            System.out.println("Enter your city name");
            String city = input.nextLine();

            System.out.println("Enter your state name");
            String state = input.next();

            System.out.println("Enter your building number");
            int buildingNum = input.nextInt();

            input.nextLine();

            System.out.println("Enter your Street name");
            String street = input.nextLine();

            input.close();


            System.out.println("Full name: " + fullName);
            System.out.println("Age: "+age);
            System.out.println("Gender: "+gender);
            System.out.println("Phone number: " +phone);
            System.out.println("Address: \n\t"+buildingNum+" "+street+"\n\t"+city+", "+state+" "+zipCode);
            System.out.println("School name: "+schoolName);

        }
    }

