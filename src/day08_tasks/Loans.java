package day08_tasks;

public class Loans {
    public static void main(String[] args) {


        int salary = 60000;
        int creditScore = 650;
        String loanResult = "";

        loanResult = (salary >= 60000 && creditScore >=650) ? "Loan Approved" : "Loan Denied";

        System.out.println(loanResult);
    }
}
