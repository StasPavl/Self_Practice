package day17_tasks;

public class TestEveryObject {
    public static void main(String[] args) {
//CAR
        Car car1 = new Car();

        car1.setInfo("Dodge", "Challenger",2022,"Orange",32599);
        car1.start();
        System.out.println(car1);
        System.out.println("---------------------------");
//Student
        Student student1 = new Student();

        student1.setInfo("Stanislav", "Pavlovskyi", 'M',29,"B28S1",'A',true);
        student1.study();
        System.out.println(student1);
        System.out.println("---------------------------");
//RECTANGLE
        Rectangle rectangle1 = new Rectangle();

        rectangle1.setInfo(6,4);
        System.out.println(rectangle1);
        System.out.println("Area of rectangle is: " + rectangle1.calculateArea(rectangle1.lenght, rectangle1.width));
        System.out.println("Perimeter of rectangle is: " + rectangle1.calculatePerimeter(rectangle1.lenght, rectangle1.width));
        System.out.println("---------------------------");
//SALARY CALCULATOR
        SalaryCalculator calculator = new SalaryCalculator();

        calculator.setInfo(15,6,13,44);
        System.out.println(calculator);

        double salary = calculator.salary(calculator.hourlyRate, calculator.weeklyHours);
        System.out.println("Salary = " + salary);

        double stateTax = calculator.stateTax(calculator.hourlyRate, calculator.weeklyHours, calculator.stateTaxRate);
        System.out.println("stateTax = " + stateTax);

        double federalTax = calculator.federalTax(calculator.hourlyRate, calculator.weeklyHours, calculator.federalTaxesRate);
        System.out.println("federalTax = " + federalTax);

        double salaryAfterTax = calculator.salaryAfterTaxes(calculator.hourlyRate, calculator.weeklyHours, calculator.federalTaxesRate);
        System.out.println("salaryAfterTax = " + salaryAfterTax);

        System.out.println("----------------------------");
//ADDRESS
        Address address = new Address();

        address.setInfo(1221,"N Pierce str","Arlington","VA", 22209);
        System.out.println(address);
        System.out.println("----------------------------");

//ITEM
        Item item1 = new Item();
        item1.setInfo("Apple",2.99,5);
        System.out.println(item1);
    }
}
