package day04_tasks;

public class SalaryCalculator_2 {
    public static void main(String[] args) {

        double hourlyRate = 50,
               weeklyHours = 45,
                stateTaxRate = 6,
                federalTaxRate = 26;

        double salaryBeforeTax = weeklyHours * hourlyRate * 52;
        double stateTax = (salaryBeforeTax * stateTaxRate) / 100;
        double federalTax = (salaryBeforeTax * federalTaxRate) / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;



        System.out.println("Gross pay is $" + salaryBeforeTax +
                "\n\tFederal tax is: $" + federalTax +
                "\n\tState tax is: $" + stateTax +
                "\n\tTotal tax is: $" + totalTax +
                "\n\tNet income is: $" + salaryAfterTax);

    }
}
