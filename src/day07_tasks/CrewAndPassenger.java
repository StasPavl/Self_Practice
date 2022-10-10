package day07_tasks;

public class CrewAndPassenger {
    public static void main(String[] args) {

        int pplNumber = 101;
        String result = "";
        int total = 0;


        if (pplNumber >= 30 && pplNumber <= 100){

            if (pplNumber >= 30 && pplNumber < 50){
                total = pplNumber + 20;
                result = "Total " + total + " ====> 20 crew, " + pplNumber + " passengers";
            }else if (pplNumber >= 50 && pplNumber < 70){
                total = pplNumber + 25;
                result = "Total " + total + " ====> 25 crew, " + pplNumber + " passengers";
            }else {
                total = pplNumber + 30;
                result = "Total " + total + " ====> 30 crew, " + pplNumber + " passengers";
            }
        }else{
            result = "Not valid amount of people";
        }
        System.out.println(result);
    }
}
