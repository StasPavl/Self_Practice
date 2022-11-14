package day21_tasks;

public class ArrWithTab {
    public static void main(String[] args) {


        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},//0
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},//1
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}//2
        };

        for (String[] each2D : items) {
            for (String element : each2D) {
                if (element.contains(" ")) {
                    System.out.print(element + "\t");
                    continue;
                }
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");

        for (String[] each2D : items) {
            for (int i = each2D.length - 1; i >= 0; i--) {
                if (each2D[i].contains(" ")) {
                    System.out.print(each2D[i] + "\t");
                    continue;
                }
                System.out.print(each2D[i] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");

        for (int i = items.length - 1; i >= 0; i--) {
            for (String element : items[i]) {
                if (element.contains(" ")) {
                    System.out.print(element + "\t");
                    continue;
                }
                System.out.print(element + " ");
            }
            System.out.println();
        }


    }
}

