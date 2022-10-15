package day09_tasks;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter product name: ");
        String productName = input.nextLine();

        System.out.println("Enter the price: ");
        double price = input.nextDouble();

        System.out.println("Enter the quantity: ");
        int quantity = input.nextInt();

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        double total = price * quantity;

        System.out.println(firstName + ", your order for " + quantity + " " + productName + " has been places. your total is $" + total);
        input.close();


    }
}
