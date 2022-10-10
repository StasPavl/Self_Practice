package day6_tasks;

public class NetIncomeCalc {
    public static void main(String[] args) {

        int salary = 200000;
        boolean isMarried = true;
        int taxes = 0;

        if (salary >= 130000 && isMarried == true){
            taxes = ((salary * 40) / 100);
        }
        if (salary >= 130000 && isMarried == false){
            taxes = ((salary * 35) / 100);
        }


        if (salary >= 100000 && salary <=129000 && isMarried == true){
            taxes = ((salary * 35) / 100);
        }
        if (salary >= 100000 && salary <=129000 && isMarried == false){
            taxes = ((salary * 30) / 100);
        }


        if (salary >= 80000 && salary <= 99000 && isMarried == true){
            taxes = ((salary * 30) / 100);
        }
        if (salary >= 80000 && salary <= 99000 && isMarried == false){
            taxes = ((salary * 25) / 100);
        }


        if (salary <= 79000 && isMarried == true){
            taxes = ((salary * 25) / 100);
        }
        if (salary >= 79000 && isMarried == false){
            taxes = ((salary * 20) / 100);
        }
        int netIncome = salary - taxes;
        System.out.println("Salary = " + salary);
        System.out.println("Taxes = " + taxes);
        System.out.println("Net Income = " + netIncome);
    }
}
