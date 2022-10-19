package day10_day11_tasks;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Split or No Split(Yes/No)");
        String split = input.next().toLowerCase();

        String split1 = split.substring(0,1).toUpperCase();
        split = split1 + split.substring(1);

        System.out.println("Enter the number of people");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount");
        int checkAmount = input.nextInt();
        input.nextLine();

        System.out.println("Service quality"); //Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%
        String serviceQuality = input.nextLine().toLowerCase();;
        String s1 = serviceQuality.substring(0,1).toUpperCase();
        serviceQuality = s1 + serviceQuality.substring(1);

        input.close();

        double totalTip = 0;
        if(serviceQuality.equals("Poor")){
                 totalTip = checkAmount * 5 /100;
        } else if (serviceQuality.equals("Fair")) {
            totalTip = checkAmount * 10 / 100;
        } else if (serviceQuality.equals("Good")) {
            totalTip = checkAmount * 15 / 100;
        }else if (serviceQuality.equals("Great")) {
            totalTip = checkAmount * 20 / 100;
        } else if (serviceQuality.equals("Excellent")) {
            totalTip = checkAmount * 25 / 100;
        }else{
            System.out.println("invalid service quality");
        }
        double totalToPay = checkAmount + totalTip;

        double perPerson = 0;
        double tipPerPerson = 0;
        if(split.equals("Yes")){
            perPerson = totalToPay / numberOfPeople;
            tipPerPerson = totalTip / numberOfPeople;
        }else{
            perPerson = totalToPay;

        }
        System.out.println("Number of people entered: " + numberOfPeople);
        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + perPerson);
        System.out.println("Tip per person: " + tipPerPerson);
        }
    }
