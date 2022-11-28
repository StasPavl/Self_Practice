package day26_tasks.circle;

public class Circle{
    public double radius;
    public double diameter;
    public static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = radius*radius;
    }
    public double calcArea(){
        return PI * (diameter);
    }
    public double calcPerimeter(){
        return 2 * PI * radius;
    }
    public void printPi(){
        System.out.println("Pi: " + PI);
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", Pi="+ PI+
                ", Area="+ calcArea()+
                ", Perimeter=" + calcPerimeter()+
                '}';
    }
}
/*
1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement
 */
