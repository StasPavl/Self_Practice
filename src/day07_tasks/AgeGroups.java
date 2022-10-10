package day07_tasks;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 150;
        String result = "";

        if (age >=1 && age <= 150){
            if (age< 21){
                result = "Teenager";
            } else if (age >= 21 && age < 55) {
                result = "Adult";
            }else{
                result = "Senior";
            }

        }else{
            result = "invalid";
        }
        System.out.println(result);
    }
}
