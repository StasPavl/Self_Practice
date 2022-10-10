package day07_tasks;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size1 = "T";
        //String size1 = "Grande";
        //String size1 = "Venti";

        if (size1 == "Tall" || size1 == "Grande" || size1 == "Venti"){

            if (size1 == "Tall"){
                System.out.println("Price is $3.69");
                System.out.println("90 calories");

            } else if (size1 == "Grande"){
                System.out.println("Price is $3.99");
                System.out.println("120 calories");

            }else{
                    System.out.println("Price is $4.29");
                    System.out.println("150 calories");
                }
        }else{
            System.out.println("Invalid Size");
        }

    }
}
