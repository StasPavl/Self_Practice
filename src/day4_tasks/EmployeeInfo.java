package day4_tasks;

public class EmployeeInfo {
    public static void main(String[] args) {
        String name = "Danial";
        int age = 28;
        String gender = "Male";
        String companyName = "Google Inc.";
        String jobTitle = "Software Developer";
        int salary = 90000;

        System.out.println(name + " is " + age + " years old, gender is " + gender + ".\n" +
                name + " works at " + companyName + " as a " + jobTitle + ".\n" +
                name + " makes $ " + salary + " per year.");
    }
}
