package day17_tasks;

public class Rectangle {
    public double lenght;
    public double width;


    public void setInfo(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                '}';
    }
    public double calculateArea(double lenght,double width){
        return this.lenght * this.width;
    }
    public double calculatePerimeter(double lenght, double width){
        return 2 * (this.lenght + this.width);
    }
}
