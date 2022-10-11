package day08_tasks;

public class OxygenTank {
    public static void main(String[] args) {
        int level = 50;
        String result = "";

        result =  (level >= 90)?"Your tank is full":(level >= 80 && level < 90)?"Still okay":
                (level >= 70 && level < 80) ?"Dont go too far":
                        (level >= 60 && level <70)?"Start to head back":" Be careful now you at 50%";
        System.out.println(result);
    }
}
