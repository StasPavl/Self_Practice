package day07_tasks;

public class Finra {
    public static void main(String[] args) {

        int num = 15;
        String result = "";

        if (num % 3 == 0 || num % 5 == 0){
            if(num % 3 == 0 && num % 5 != 0){
                result = "FIN";
            } else if (num % 3 != 0 && num % 5 == 0) {
                result = "RA";
            }else{
                result = "FINRA";
            }

        }else{
            result = " invalid number";
        }
        System.out.println(result);
    }
}
