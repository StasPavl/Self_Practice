package day27_tasks;

public class IphoneTest {
    public static void main(String[] args) {
        Iphone iphone14 = new Iphone("Iphone 14 Pro Max", 16.9,"Gold",1499);
        iphone14.call(301433186);
        iphone14.text(301433186);
        iphone14.faceTime(301433186);
        iphone14.faceTime("lichfb@gmail.com");

        System.out.println(iphone14);
    }

}
