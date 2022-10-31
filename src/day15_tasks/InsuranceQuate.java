package day15_tasks;

import java.util.Scanner;

public class InsuranceQuate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();

        System.out.println("Enter your gender");
        String gender = input.next().toLowerCase();

        //true
        while (!(gender.equals("male") || gender.equals("female"))) { //true || false
            System.out.println("Invalid entry, please re-enter your GENDER");
            gender = input.next();
        }

        System.out.println("Are you married? Yes/No");
        String isMarried = input.next().toLowerCase();

        while (!(isMarried.equalsIgnoreCase("Yes") || isMarried.equalsIgnoreCase("No"))) {
            System.out.println("Invalid entry, please re-enter your marriage status");
            isMarried = input.next();
        }

        System.out.println("Enter your age");
        int age = input.nextInt();

        while (!(age > 0 && age <= 120)) {
            System.out.println("Invalid entry, Please re-entry your age");
            age = input.nextInt();
        }
        System.out.println("How many miles do you drive per day?");
        int milesPerDay = input.nextInt();

        while (!(milesPerDay < 0 || milesPerDay >= 5)) {
            System.out.println("Invalid entry, Please re-entry your miles per day");
            milesPerDay = input.nextInt();
        }
        input.nextLine();
        System.out.println("Do you wanna full coverage or liability insurance?");
        String insuranceType = input.nextLine().toLowerCase();

        System.out.println("Did you have accidence or claims last 5 years? Yes/No");
        String accidence = input.next().toLowerCase();

        while (!(accidence.equalsIgnoreCase("yes") || accidence.equalsIgnoreCase("No"))) {
            System.out.println("Invalid entry, please re-enter your answer");
            accidence = input.next();
        }
        System.out.println("Is your car has anti-theft device? Yes/No");
        String theftDevice = input.next();

        while (!(theftDevice.equalsIgnoreCase("Yes") || theftDevice.equalsIgnoreCase("No"))) {
            System.out.println("Invalid entry, please re-enter your answer");
            theftDevice = input.next();
        }

        double totalPrice = 0;

        if (insuranceType.equalsIgnoreCase("liability insurance")) {
            //AGE
            if (age < 25) {
                totalPrice += 90;
            } else {
                totalPrice += 50;
            }
            //MILES
            if (milesPerDay <= 10) {
                totalPrice += 10;
            } else if (milesPerDay > 10 && milesPerDay <= 50) {
                totalPrice += 30;
            } else {
                totalPrice += 50;
            }
        } else { //Full coverage
            if (age < 25) {
                totalPrice += 160;
            } else {
                totalPrice += 120;
            }
            //MILES
            if (milesPerDay <= 10) {
                totalPrice += 20;
            } else if (milesPerDay > 10 && milesPerDay <= 50) {
                totalPrice += 40;
            } else {
                totalPrice += 70;
            }
        }
        //System.out.println("total price before discount" + totalPrice);//160$ ==> test of counting
        if (theftDevice.equalsIgnoreCase("yes")) {
            //160$         8$
            totalPrice -= (totalPrice * 0.05);
        }
        //System.out.println("total price after device disc" + totalPrice);//? 152$ ==> test of counting
        if (accidence.equalsIgnoreCase("yes")) {
            totalPrice += (totalPrice * 0.15);
        } else {
            totalPrice -= (totalPrice * 0.1);
        }
        //System.out.println("total price after accident disc" + totalPrice);//? 136.8$ ==> test of counting

        if (isMarried.equalsIgnoreCase("yes")) {
            totalPrice -= (totalPrice * 0.05);
        }
        //System.out.println("total price after marrige disc" + totalPrice);//? 136.8$ ==> test of counting

        System.out.println("-----------------------------------------");
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender.substring(0, 1).toUpperCase() + gender.substring(1));
        System.out.println("Married = " + isMarried.substring(0, 1).toUpperCase() + isMarried.substring(1));
        System.out.println("Insurance Type = " + insuranceType.substring(0, 1).toUpperCase() + insuranceType.substring(1));
        System.out.println("Accidence last 5 years = " + accidence.substring(0, 1).toUpperCase() + accidence.substring(1));
        System.out.println("---------------------------------------------");
        System.out.println("Total price of your insurance is: $" + totalPrice);
    }

}
