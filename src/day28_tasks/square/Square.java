package day28_tasks.square;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0){
            System.err.println("Side of square can not be zero or less then zero");
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) {
        setSide(side);
    }

    public double calcArea(){
        return getSide() * getSide();
    }
    public double calcPerimeter(){
        return 4 * getSide();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                ", area of square=" + calcArea() +
                ", perimeter of square=" + calcPerimeter() +
                '}';
    }
}
/*
 Create a class named Square:
        Private variables:
            side

        Encapsulate all the fields

            Condition:
                side of the square should not be negative

        Add a constructor that allows user to set all the fields when the object is created.


        Methods:
            calcArea(): returns the area of square
            calcPerimeter(): returns the perimeter of square
            toString(): can display the side, area, perimeter of square when object is passed in print statement

 */
