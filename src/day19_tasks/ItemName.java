package day19_tasks;

import java.util.Scanner;

public class ItemName {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            String[] name = new String[5];
            double[] price = new double[5];
            double totalPrice = 0;

            for (int i = 0, j = 0; i < name.length; i++, j++) {
                System.out.println("Enter a name of item:");
                name[i] = input.nextLine();
                System.out.println("Enter a price of item: ");
                price[i] = input.nextDouble();
                input.nextLine();
            }
            for (int i = 0; i < name.length; i++) {
                System.out.println(name[i] + " -- $" + price[i]);
                totalPrice += price[i];

            }
            System.out.println("Total Price: $" + totalPrice);
        }
    }

