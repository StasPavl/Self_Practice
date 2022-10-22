package day06_tasks;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 87;

        String result = "";

        if (age >= 1 && age <= 2) {
            result = "Infant";
        }
        if (age >= 3 && age <= 5) {
            result = "Toddler";
        }
        if (age >= 6 && age <= 9) {
            result = "Kid";
        }
        if (age >= 10 && age <= 12) {
            result = "Pre-Teen";
        }
        if (age >= 13 && age <= 17) {
            result = "Teenager";
        }
        if (age >= 18 && age <= 20) {
            result = "Young Adult";
        }
        if (age >= 21 && age <= 39) {
            result = "Adult";
        }
        if (age >= 40 && age <= 49) {
            result = "Young Middle-Aged Adult";
        }
        if (age >= 50 && age <= 54) {
            result = "Middle-Aged Adult";
        }
        if (age >= 55 && age <= 64) {
            result = "Very Young Senior Citizen";
        }
        if (age >= 65 && age <= 74) {
            result = "Young Senior Citizen";
        }
        if (age >= 75 && age <= 84) {
            result = "Senior Citizen";
        }if (age >= 85){
            result = "Old Senior Citizen";
        }
        System.out.println(result);
    }
}



