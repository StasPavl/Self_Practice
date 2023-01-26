package day44_lambda.apple_task;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        //Created bucket with apples
        List<Apple> bucket = new ArrayList<>();
        bucket.add(new Apple("Green", 80));
        bucket.add(new Apple("Red", 155));
        bucket.add(new Apple("Green", 120));
        System.out.println(bucket);


//Lambda expression to check the weight and print with color
        AppleTest checkAppleWeight = apple -> {
            if (apple.getWeight()< 140){
                return "A Light " + apple.getColor() + " apple" ;
            }else {
                return "A Heavy " + apple.getColor() + " apple";
            }
        };


//lambda expression to print just weight of apple
        AppleTest printAppleWeight = apple -> "An apple of " + apple.getWeight() + "g";



//calling our custom method
        prettyPrintApple(bucket, checkAppleWeight);
        prettyPrintApple(bucket, printAppleWeight);

    }
    //custom method which take as arguments List of Apples and AppleTest interface
    public static void prettyPrintApple(List<Apple> inventory, AppleTest x){
        for (Apple apple : inventory) {
            String output = x.test(apple);
            System.out.println(output);
        }
    }

}
