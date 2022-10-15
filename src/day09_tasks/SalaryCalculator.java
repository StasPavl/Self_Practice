package day09_tasks;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly Rate:");
        int hourlyRate = input.nextInt();

        System.out.println("Enter how many hours you works in a week:");
        double workHours = input.nextDouble();

        System.out.println("State tax: ");
        int stateTaxInPercentage = input.nextInt();

        System.out.println("Federal tax: ");
        int federalTaxInPercentage = input.nextInt();

        double salary = (hourlyRate * workHours) * 52;
        double stateTax = salary * stateTaxInPercentage / 100;
        double federalTax = salary * federalTaxInPercentage / 100;
        double totalTax = stateTax + federalTax;
        double netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);
        }
    }
