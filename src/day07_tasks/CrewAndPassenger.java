package day07_tasks;

public class CrewAndPassenger {
    public static void main(String[] args) {

        int pplNumber = 66;
        String result = "";
        int totalOnTheBoat = 0;


        if (pplNumber >= 30 && pplNumber <= 100){

            if (pplNumber >= 30 && pplNumber < 50){
                totalOnTheBoat = pplNumber + 20;
                result = "Total " + totalOnTheBoat + " ====> 20 crew, " + pplNumber + " passengers";

            }else if (pplNumber >= 50 && pplNumber < 70){
                totalOnTheBoat = pplNumber + 25;
                result = "Total " + totalOnTheBoat + " ====> 25 crew, " + pplNumber + " passengers";

            }else {
                totalOnTheBoat = pplNumber + 30;
                result = "Total " + totalOnTheBoat + " ====> 30 crew, " + pplNumber + " passengers";
            }
        }else{
            result = "Not valid amount of people";
        }
        System.out.println(result);
    }
}
