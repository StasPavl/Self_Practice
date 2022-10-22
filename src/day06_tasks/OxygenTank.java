package day06_tasks;

public class OxygenTank {
    public static void main(String[] args) {

        int level = 90;
        String result = "";

        if (level >= 90){
            result = "Your tank is full";
        }
        if (level >= 80 && level < 90){
            result = "Still okay";
        }
        if (level >= 70 && level < 80) {
            result = "Dont go too far";
        }
        if (level >= 60 && level <70){
            result = "Start to head back";
        }
        if (level <= 50){
            result = " Be careful now you at 50%";
        }
        System.out.println(result);
    }
}
