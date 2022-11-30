package day27_tasks;

public class Iphone {
    public static String brand;
    public String model;
    public double size;
    public String color;
    public double price;
    public static String OS;
    public static boolean isSmartPhone;
    public static String madeIn;
    public static String designedIn;

    static {
        brand = "Apple";
        OS = "iOS";
        isSmartPhone = true;
        madeIn = "Chine";
        designedIn = "USA";
    }

    public Iphone(String model, double size, String color, double price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public static void printOperationSystem(){
        System.out.println(OS);
    }
    public void call(long number){
        System.out.println("Calling " + number);
    }
    public void text(long number){
        System.out.println("Texting " + number);
    }
    public void faceTime(long number){
        System.out.println("Face timing by " + number);
    }
    public void faceTime(String email){
        System.out.println("Face timing by " + email);
    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", OperatingSystem=" + OS +
                ", Made in=" + madeIn +
                ", Designed in=" + designedIn +
                '}';
    }
}
/*
Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */
