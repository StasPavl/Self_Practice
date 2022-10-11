package day08_tasks;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 55;
        String result ="";

        result = (age >= 1 && age <= 2) ? "Infant": (age >= 3 && age <= 5) ? "Toddler" :(age >= 6 && age <= 9) ?"Kid":
                (age >= 10 && age <= 12) ? "Pre-Teen": (age >= 13 && age <= 17) ?"teenager": (age >= 18 && age <= 20) ? "Young Adult":
        (age >= 21 && age <= 39)? "Adult":(age >= 40 && age <= 49) ?"Young Middle-Aged Adult":(age >= 50 && age <= 54)?"Middle-Aged Adult":
        (age >= 55 && age <= 64) ?"Very Young Senior Citizen":(age >= 65 && age <= 74) ?"Young Senior Citizen":
                (age >= 75 && age <= 84) ?"Senior Citizen":"Old Senior Citizen";
        System.out.println(result);
    }
}
