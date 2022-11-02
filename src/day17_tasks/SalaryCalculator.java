package day17_tasks;

public class SalaryCalculator {
    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxesRate;
    public double weeklyHours;

    public double salary(double hourlyRate, double weeklyHours){
        return this.hourlyRate * this.weeklyHours * 52;
    }
    public double stateTax(double hourlyRate, double weeklyHours, double stateTaxRate){
        double salary = this.hourlyRate * this.weeklyHours * 52;
        return salary * this.stateTaxRate / 100;
    }
    public double federalTax(double hourlyRate, double weeklyHours, double federalTaxesRate) {
        double salary = this.hourlyRate * this.weeklyHours * 52;
        return salary * this.federalTaxesRate / 100;
    }
    public double salaryAfterTaxes(double hourlyRate, double weeklyHours, double federalTaxesRate){
        double salary = this.hourlyRate * this.weeklyHours * 52;
        return (salary - (salary * this.federalTaxesRate / 100)) - (salary * this.stateTaxRate / 100);
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTax=" + stateTaxRate +
                ", federalTaxes=" + federalTaxesRate +
                ", weeklyHours=" + weeklyHours +
                '}';
    }

    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxesRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxesRate = federalTaxesRate;
        this.weeklyHours = weeklyHours;
    }
}
