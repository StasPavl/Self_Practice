package day04_tasks;

public class Circle {
    public static void main(String[] args) {

        int radiusCircle = 5;

        double P = 3.14;
        double areaCircle = P * (radiusCircle * radiusCircle);  //A = pr2
        double perimeterCircle = 2 * (P * radiusCircle); // perimeter = 2pr

        System.out.println("Area of the circle is " + areaCircle);
        System.out.println("Perimeter of the circle is " + perimeterCircle);

    }
}
